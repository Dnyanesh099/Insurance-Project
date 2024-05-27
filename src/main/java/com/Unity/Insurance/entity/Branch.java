package com.Unity.Insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Branch 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String Branch_name;
	private String Branch_city;
}
