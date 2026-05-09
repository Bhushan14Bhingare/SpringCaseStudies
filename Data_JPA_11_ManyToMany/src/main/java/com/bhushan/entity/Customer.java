package com.bhushan.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "Customer_Details")
@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
	@Column(name = "Cust_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "cust_seq_gen")
	@SequenceGenerator(
			name = "cust_seq_gen",
			sequenceName = "cust_seq",
			allocationSize = 1
			)
	private Long customerId;
	@NonNull
	@Column(name = "Customer_Name",length = 10)
	private String customerName;
	@NonNull
	@Column(name = "Address",length = 10)
	private String city;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name ="CustomerAndAccount",joinColumns = @JoinColumn(name = "Customer_id"),
	inverseJoinColumns = @JoinColumn(name ="Account_number"))
	private Set<BankAccount> account = new HashSet<BankAccount>() ;
}
