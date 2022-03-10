package com.shbigdel.policy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shbigdel.policy.entity.Policy;
import com.shbigdel.policy.repository.PolicyRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepository;

	@Autowired
	private RestTemplate restTemplate;

	public Policy savePolicy(Policy policy) {	
		return policyRepository.save(policy);
	}
	
	public Policy findByPolicyId(Long policyId) {	
		return policyRepository.findByPolicyId(policyId);
	}

//	public ResponseTemplateVO getUserWithDepartment(Long userId) {
//
//		ResponseTemplateVO vo = new ResponseTemplateVO();
//		User user = userRepository.findByUserId(userId);
//		if (user == null) {
//			log.info("No user found");
//			return vo;
//		}
//
//		UserGroup group = restTemplate.getForObject("http://localhost:9001/usergroup/" + user.getGroupId(),
//				UserGroup.class);
//		
//		vo.setUser(user);
//		vo.setGroup(group);
//
//		return vo;
//	}

}
