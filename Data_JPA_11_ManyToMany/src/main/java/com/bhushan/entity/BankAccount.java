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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "BankAccountHolder")
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccount {
	@Id
	@Column(name = "Account_number")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "acc_seq_gen")
	@SequenceGenerator(
			name = "acc_seq_gen",
			sequenceName = "acc_seq",
			allocationSize = 1
			)
	private Long accountId;
	@NonNull
	@Column(name = "Account_Type" , length = 10)
	private String accountType;
	@NonNull
	@Column(name = "Account_Balance",length = 8)
	private Double balance;	
	

	@ManyToMany(mappedBy = "account",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Customer> customer = new HashSet<>();
}
