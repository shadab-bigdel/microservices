package com.shbigdel.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shbigdel.user.entity.User;
import com.shbigdel.user.repository.UserRepository;
import com.shbigdel.user.vo.UserGroup;
import com.shbigdel.user.vo.ResponseTemplateVO;

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

	public ResponseTemplateVO getUserWithDepartment(Long userId) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		if (user == null) {
			log.info("No user found");
			return vo;
		}

		UserGroup department = restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(),
				UserGroup.class);
		vo.setUser(user);
		vo.setDepartment(department);

		return vo;
	}

}