package com.shbigdel.policy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shbigdel.policy.entity.Policy;
import com.shbigdel.policy.service.PolicyService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping ("/policies")
@Slf4j
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;
	
	
	
	@PostMapping("/")
	public Policy savePolicy (@RequestBody Policy policy) {
		log.info("Saving Policy");
		return policyService.savePolicy(policy);
	}
	
	@GetMapping("/{id}")
	public Policy getPolicy (@PathVariable("id") Long policyId) {
		log.info("finding user group");
		return policyService.findByPolicyId(policyId);
	}

}
