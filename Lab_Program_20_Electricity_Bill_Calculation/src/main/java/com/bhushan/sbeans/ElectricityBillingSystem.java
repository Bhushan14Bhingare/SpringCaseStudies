package com.bhushan.sbeans;

public class ElectricityBillingSystem {
  private BillingStrategy billing;

  public ElectricityBillingSystem(BillingStrategy billing) {
	this.billing = billing;
  }
  
  public void showBill(double units) {
	  System.out.println("Total Bill Amount : "+billing.calculateBill(units));
  }
}
