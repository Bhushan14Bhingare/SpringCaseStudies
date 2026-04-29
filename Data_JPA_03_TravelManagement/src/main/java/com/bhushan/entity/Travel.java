package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "TravelSystem")
public class Travel {

	@Column(name = "Customer_Id")
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name = "Destination" ,length = 30)
	private String destination;
	@Column(name = "Transportmode" ,length = 30)
	private String transportationMode;
	@Column(name = "Fair" ,length = 30)
	private Double price;

}
