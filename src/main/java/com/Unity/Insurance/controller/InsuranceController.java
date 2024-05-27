package com.Unity.Insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Unity.Insurance.service.Insurance_Service;

@RestController("/Insurance")
public class InsuranceController 
{
	@Autowired
	Insurance_Service service;
}
