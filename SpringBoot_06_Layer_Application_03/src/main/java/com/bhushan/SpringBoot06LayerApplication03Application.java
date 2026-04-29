package com.bhushan;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bhushan.bean.BookBean;
import com.bhushan.controller.BookController;

@SpringBootApplication
public class SpringBoot06LayerApplication03Application {   

	public static void main(String[] args) {
	  ApplicationContext ctx =	SpringApplication.run(SpringBoot06LayerApplication03Application.class, args);
	  BookController bean = ctx.getBean(BookController.class);
	  Scanner sc = new Scanner(System.in);
	  while(true) {
			System.out.println("1.Insert Book");
			System.out.println("2.Retrive Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Update Book");
			System.out.println("5.Exit");
			
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1 ->{
				System.out.println("Enter book id : ");
				int bookId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter book title : ");
				String title =  sc.nextLine();
				
				System.out.println("Enter book author : ");
				String author =  sc.nextLine();
				
				System.out.println("Enter book price : ");
				double price = Double.parseDouble(sc.nextLine());
				
				BookBean book = new BookBean(bookId,title,author,price);
				bean.addBook(book);
			}
			case 3 ->{
				System.out.println("Enter book id : ");
				int bookId = Integer.parseInt(sc.nextLine());
				
				bean.deleteBook(bookId);
			}
			case 4->{
				System.out.println("Enter book id : ");
				int bookId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter book price: ");
				double price = Double.parseDouble(sc.nextLine());
				
				bean.updateBook(bookId, price);
			}
			
			case 2->{
				bean.retriveBook();
			}
			case 5->{
				sc.close();
				System.exit(0);
			}
			default ->{
				System.out.println("Please enter a valid option");
			}
			}
	  }
	}

}
