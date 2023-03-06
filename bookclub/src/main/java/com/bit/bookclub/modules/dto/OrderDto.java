package com.bit.bookclub.modules.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class OrderDto {
	
	private String name;
	
	private Integer price;
	
	private String img;

}
