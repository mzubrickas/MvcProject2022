package eu.codeacademy.skyfly.product.service;
import eu.codeacademy.skyfly.product.dto.ProductDto;
import eu.codeacademy.skyfly.product.entity.Product;
import eu.codeacademy.skyfly.product.exception.ProductNotFoundException;
import eu.codeacademy.skyfly.product.mapper.ProductMapper;
import eu.codeacademy.skyfly.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public void addProduct(ProductDto productDto) {
        productRepository.save(Product.builder()
                .productId(UUID.randomUUID())
                .origin(productDto.getOrigin())
                .destination(productDto.getDestination())
                .departureDate(productDto.getDepartureDate())
                .returnDate(productDto.getReturnDate())
                .travelClass(productDto.getTravelClass())
                .adults(productDto.getAdults())
                .children(productDto.getChildren())
                .infants(productDto.getInfants())
                .build());
    }


    public Page<ProductDto> getProductPaginated(Pageable pageable) {
        return productRepository.findAll(pageable)
                .map(mapper::mapTo);
    }

    public ProductDto getProductByUUID(UUID id) {
        return productRepository.findByProductId(id)
                .map(mapper::mapTo)
                .orElseThrow(ProductNotFoundException::new);
    }

}
