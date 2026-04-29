package com.bhushan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name ="OrderDetails")
@NoArgsConstructor
public class FoodOrder {

	@Column(name="Order_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	@Column(name="Customer_name", length = 30)
	private String customerName;
	@Column(name="FoodItem_name", length = 30)
	private String foodItem;
	@Column(name="Quantity", length = 10)
	private Integer quantity;
	@Column(name="Amount", length = 10)
	private Double pricePerItem;
	 @Transient  
    private Double totalAmount;

	 public Double getTotalAmount() {
		 
		 if(quantity>5) {
			 totalAmount = totalAmount - (totalAmount * 0.10);
			 if(totalAmount > 1000) {
				 return totalAmount - 100;
			 }
			 else {
				 return totalAmount;
			 }
		 }
		 return totalAmount;
	 }

	 public FoodOrder(String name, String itemName, Integer quantity, Double price) {
		 this.customerName = name;
		 this.foodItem = itemName;
		 this.quantity = quantity;
		 this.pricePerItem = price;
	 }
}
