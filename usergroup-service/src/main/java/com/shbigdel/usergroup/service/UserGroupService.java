package com.shbigdel.usergroup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shbigdel.usergroup.entity.UserGroup;
import com.shbigdel.usergroup.repository.UserGroupRepository;
import com.shbigdel.usergroup.vo.Policy;
import com.shbigdel.usergroup.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserGroupService {

	@Autowired
	private UserGroupRepository userGroupRepository;

	@Autowired
	private RestTemplate restTemplate;

	public UserGroup saveUserGroup(UserGroup userGroup) {
		return userGroupRepository.save(userGroup);
	}

	public ResponseTemplateVO getUserGroupWithPolicy(Long userGroupId) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		UserGroup userGroup = userGroupRepository.findByGroupId(userGroupId);
		if (userGroup == null) {
			log.info("No group  found");
			return vo;
		}

		Policy policy = restTemplate.getForObject("http://localhost:9003/policies/" + userGroup.getPolicyId(),
				Policy.class);
		
		vo.setUserGroup(userGroup);
		vo.setPolicy(policy);

		return vo;
	}

}
