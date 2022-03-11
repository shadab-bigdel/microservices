package com.shbigdel.policy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shbigdel.policy.entity.Policy;
import com.shbigdel.policy.repository.PolicyRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	public Policy savePolicy(Policy policy) {
		return policyRepository.save(policy);
	}

	public Policy findByPolicyId(Long policyId) {
		return policyRepository.findByPolicyId(policyId);
	}

}
