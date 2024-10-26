package com.ust.rest.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	private long productId;
	private String brand;
	private String description;
	private int qty;
	private int price;
	
}
