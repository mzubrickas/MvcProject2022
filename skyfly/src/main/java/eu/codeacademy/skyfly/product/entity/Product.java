package eu.codeacademy.skyfly.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID productId;
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private String travelClass;
    private Integer adults;
    private Integer children;
    private Integer infants;

}
