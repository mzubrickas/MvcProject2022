package eu.codeacademy.skyfly.product.service;
import eu.codeacademy.skyfly.product.dto.ProductDto;
import eu.codeacademy.skyfly.product.exception.ProductNotFoundException;
import eu.codeacademy.skyfly.product.mapper.ProductMapper;
import eu.codeacademy.skyfly.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class ProductService {
//
//    private final ProductRepository productRepository;
//    private final ProductMapper mapper;
//
//
//
//    public ProductDto getProductByUUID(UUID id) {
//        return productRepository.findByProductId(id)
//                .map(mapper::mapTo)
//                .orElseThrow(ProductNotFoundException::new);
//    }

}
