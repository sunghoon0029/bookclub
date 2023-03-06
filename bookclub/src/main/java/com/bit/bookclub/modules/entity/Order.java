package com.bit.bookclub.modules.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
@EqualsAndHashCode
public class Order {
	
	private Integer id;
	
	private String name;
	
	private Integer price;

}
