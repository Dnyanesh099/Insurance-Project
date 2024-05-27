package com.Unity.Insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Unity.Insurance.repository.Insurance_Repo;

@Service
public class Insurance_Service {

	@Autowired
	Insurance_Repo Repo;
}
