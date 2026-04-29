package com.bhushan.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
        private String brand;
        private String processor;
        private String ram;
        
        
		public Laptop() {
			System.out.println("Laptop.Laptop:: 0 param Constructor");
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getProcessor() {
			return processor;
		}


		public void setProcessor(String processor) {
			this.processor = processor;
		}


		public String getRam() {
			return ram;
		}


		public void setRam(String ram) {
			this.ram = ram;
		}
        
        
}
