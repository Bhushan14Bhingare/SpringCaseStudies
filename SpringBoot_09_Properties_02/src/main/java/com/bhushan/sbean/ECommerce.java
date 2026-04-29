package com.bhushan.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ECommerce {
    
	@Value("${prod.name}")
	private String name;
	@Value("${prod.price}")
	private double price;
	@Value("${prod.per}")
	private double percentage;
	@Value("#{${prod.price}-(${prod.per}* ${prod.price})/100}")
	private double finalPrice;
	
}
