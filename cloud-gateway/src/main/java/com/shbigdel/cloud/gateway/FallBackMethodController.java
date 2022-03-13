package com.shbigdel.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FallBackMethodController {
	
	
//	@HystrixCommand
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod (){
		return  "User service is taking longer than expected. Please try it later!";
	}
	
//	@HystrixCommand
	@GetMapping("/userGroupServiceFallBack")
	public String userGroupServiceFallBackMethod (){
		return  "User Group service is taking longer than expected. Please try it later!";
	}
	
//	@HystrixCommand
	@GetMapping("/policyServiceFallBack")
	public String policyServiceFallBackMethod (){
		return  "Policy service is taking longer than expected. Please try it later!";
	}
	
	
}
