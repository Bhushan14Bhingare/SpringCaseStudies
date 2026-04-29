package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class RestaurantBillGenerator {
       private double foodAmount;
       private double drinksAmount;
       private double serviceCharge;
       private double gstPercentage;
       
       
	   public RestaurantBillGenerator() {
	}
	   
	   @Autowired
	   @Qualifier("food")
	   public void setFoodAmount(double foodAmount) {
		   this.foodAmount = foodAmount;
	   }
	   
	   @Autowired
	   @Qualifier("drink")
	   public void setDrinksAmount(double drinksAmount) {
		   this.drinksAmount = drinksAmount;
	   }
	   
	   @Autowired
	   @Qualifier("service")
	   public void setServiceCharge(double serviceCharge) {
		   this.serviceCharge = serviceCharge;
	   }
	   
	   @Autowired
	   @Qualifier("gst")
	   public void setGstPercentage(double gstPercentage) {
		   this.gstPercentage = gstPercentage;
	   }
       
       public double generateFinalBill() {
    	   double baseAmount = foodAmount + drinksAmount + serviceCharge;
    	   double gstAmount = baseAmount * gstPercentage / 100;
    	   return (baseAmount + gstAmount);
       }
}
