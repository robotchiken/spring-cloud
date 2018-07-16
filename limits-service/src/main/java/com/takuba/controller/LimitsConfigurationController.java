package com.takuba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takuba.Configuration;
import com.takuba.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations(){
		return new LimitConfiguration(configuration.getMinimun(), configuration.getMaximum());
	}
}
