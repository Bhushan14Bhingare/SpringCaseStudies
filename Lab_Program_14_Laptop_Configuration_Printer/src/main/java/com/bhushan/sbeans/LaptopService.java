package com.bhushan.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
     
	private Laptop laptop;

	public LaptopService() {
		System.out.println("LaptopService.LaptopService:: 0 param Constructor");
	}
    @Autowired
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void printLaptopDetails() {
		System.out.println("Laptop Brand: "+laptop.getBrand());
		System.out.println("Processor: "+laptop.getProcessor());
		System.out.println("RAM: "+laptop.getRam());
	}
}
