package eu.codeacademy.skyfly.product.service;
import eu.codeacademy.skyfly.product.dto.ProductDto;
import eu.codeacademy.skyfly.product.entity.Product;
import eu.codeacademy.skyfly.product.exception.ProductNotFoundException;
import eu.codeacademy.skyfly.product.mapper.ProductMapper;
import eu.codeacademy.skyfly.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;

    public void addProduct(ProductDto product) {
//        productRepository.save(product);
    }

    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream()
                .map(mapper::mapTo)
                .collect(Collectors.toList());
    }


}
