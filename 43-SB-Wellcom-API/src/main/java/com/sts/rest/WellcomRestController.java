package com.sts.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomRestController {
	@GetMapping("/wellcom")
	public String wellcomMsg() {
		String msg="Wellcom to Microservices";
		return msg;
	}
}
