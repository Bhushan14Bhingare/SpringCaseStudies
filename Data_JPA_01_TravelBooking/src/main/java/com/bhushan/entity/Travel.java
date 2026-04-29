package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="TravelManagement")
public class Travel {
 
	@Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "Destination",length=30)
	private String destination;
	@Column(name = "transMode",length=30)
	private String transportationMode;
	@Column(name = "Price",length=10)
	private Double price;
	
	public Travel() {
	}

	public Travel(String dest, String mode, Double price) {
		this.destination = dest;
		this.transportationMode = mode;
		this.price = price;
	}
		
}
