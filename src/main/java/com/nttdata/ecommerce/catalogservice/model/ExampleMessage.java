package com.nttdata.ecommerce.catalogservice.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ExampleMessage implements Serializable {
    String event;
    String productID;
    BigDecimal price;
    Integer inStock;

}
