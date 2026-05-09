package com.bhushan.runner;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bhushan.entity.BankAccount;
import com.bhushan.entity.Customer;
import com.bhushan.repository.ICustomerRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerRepo repo;
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		
		BankAccount bank1 = new BankAccount("Saving",5000D);
		
		BankAccount bank2 = new BankAccount("Current",50000d);
		
		BankAccount bank3 = new BankAccount("Saving",10000D);
		
		BankAccount bank4 = new BankAccount("Current",30000d);
		
		
		HashSet<BankAccount> acc = new HashSet<BankAccount>();
		acc.add(bank1);
		acc.add(bank2);
		
		HashSet<BankAccount> acc1 = new HashSet<BankAccount>();
		acc1.add(bank3);
		acc1.add(bank4);
		
		Customer cust1 = new Customer("Bhushan","Nagpur");
		
		cust1.setAccount(acc);
		
		Customer cust2 = new Customer("Krishna","Patna");
		
		cust2.setAccount(acc1);
		
		HashSet<Customer> customer = new HashSet<Customer>();
		customer.add(cust1);
		bank1.setCustomer(customer);
		bank2.setCustomer(customer);
		
		HashSet<Customer> customer1 = new HashSet<Customer>();
		customer1.add(cust2);
		bank3.setCustomer(customer1);
		bank4.setCustomer(customer1);
		
		repo.save(cust1);
		repo.save(cust2);
		
		
		System.out.println("Data inserted Successfully");
		
		
		repo.findAll().forEach(cust ->{
			System.out.println("----------------------");
			System.out.println("Customer Id : "
					+cust.getCustomerId());
			System.out.println("Customer Name : "
					+cust.getCustomerName());
			System.out.println("Customer Address : "
					+cust.getCity());
			
			System.out.println("Bank Accounts");

			cust.getAccount().forEach(account->{
				System.out.println(
				account.getAccountType()
				+" - "+account.getAccountId()+" - "+account.getBalance()
				);
			});
		});
	}

}
