package com.bhushan.test;

import java.util.Scanner;

import com.bhushan.sbeans.Food;
import com.bhushan.sbeans.FoodFactoy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a food type (Pizza/Burger)");
    
    	String type = sc.nextLine();
       Food serve =  FoodFactoy.getInstance(type);
       serve.prepareFood();
        sc.close();
    }
}
