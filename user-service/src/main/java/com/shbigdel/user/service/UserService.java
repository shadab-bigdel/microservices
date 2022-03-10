package com.shbigdel.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shbigdel.user.entity.User;
import com.shbigdel.user.repository.UserRepository;
import com.shbigdel.user.vo.UserGroup;
import com.shbigdel.user.vo.UserGroupResponseTemplateVO;
import com.shbigdel.user.vo.UserResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public UserResponseTemplateVO getUserWithGroup(Long userId) {

		UserResponseTemplateVO vo = new UserResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		if (user == null) {
			log.info("No user found");
			return vo;
		}

		UserGroupResponseTemplateVO userGroupResponseTemplateVO = restTemplate.getForObject("http://localhost:9002/usergroups/" + user.getGroupId(),
				UserGroupResponseTemplateVO.class);
		vo.setUser(user);
		vo.setUserGroup(userGroupResponseTemplateVO.getUserGroup());
		vo.setPolicy(userGroupResponseTemplateVO.getPolicy());

		return vo;
	}

}
