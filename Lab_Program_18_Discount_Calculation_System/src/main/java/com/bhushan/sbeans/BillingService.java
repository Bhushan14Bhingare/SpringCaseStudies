package com.bhushan.sbeans;




public class BillingService {
		
    private DiscountStrategy customer;
    
    
    public BillingService(DiscountStrategy customer) {
		this.customer = customer;
	}


	public void generateBill(double amount) {
    	double discount = customer.calculateDiscount(amount);
    	double finalpay = amount - discount;
    	System.out.println("Original Amount : "+amount);
    	System.out.println("Discount Amount : "+discount);
    	System.out.println("Final Payable Amount : "+finalpay);
    }
}
