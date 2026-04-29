package com.bhushan.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Payment {
   
	private Integer id;
	private Double amount;
    private String	method;
    
    

}
