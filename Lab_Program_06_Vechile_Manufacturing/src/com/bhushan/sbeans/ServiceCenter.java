package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	@Autowired
     private Vechile vechile;
     private String serviceType;
     
     
	 public void setVechile(Vechile vechile) {
		 this.vechile = vechile;
	 }
	 public void setServiceType(String serviceType) {
		 this.serviceType = serviceType;
	 }
	 
	 public void performService() {
		 vechile.displayVechileInfo();
		System.out.println( "Service Type=" + serviceType );
	 }
     
	 
	
     
     
}
