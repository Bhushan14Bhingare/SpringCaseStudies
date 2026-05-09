package com.bhushan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.entity.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Long> {

}
