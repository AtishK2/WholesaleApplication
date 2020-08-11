package com.restservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter 
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
public class Product {
	private int id;
	private String productName;
	private String productType;
}
