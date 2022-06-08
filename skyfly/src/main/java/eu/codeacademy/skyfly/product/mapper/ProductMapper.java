package eu.codeacademy.skyfly.product.mapper;
import eu.codeacademy.skyfly.product.dto.ProductDto;
import eu.codeacademy.skyfly.product.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public ProductDto mapTo(Product product) {
        return ProductDto.builder()
                .productId(product.getProductId())
                .origin(product.getOrigin())
                .destination(product.getDestination())
                .departureDate(product.getDepartureDate())
                .returnDate(product.getReturnDate())
                .travelClass(product.getTravelClass())
                .adults(product.getAdults())
                .children(product.getChildren())
                .infants(product.getInfants())
                .build();
    }
}
