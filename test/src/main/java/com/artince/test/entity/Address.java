package com.artince.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name = "door_no")
	Integer doorNo;
	
	@Column(name = "street")
	String street;
	
	@Column(name = "state")
	String state;
	
	@Column(name = "country")
	String country;
}
