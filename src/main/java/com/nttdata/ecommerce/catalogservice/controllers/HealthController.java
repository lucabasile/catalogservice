package com.nttdata.ecommerce.catalogservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HealthController {
	
	private String IM_OK="Healthy and running";
	
	@GetMapping("/healthCheck")
	public String Hi() {
		return IM_OK;
	}

}
