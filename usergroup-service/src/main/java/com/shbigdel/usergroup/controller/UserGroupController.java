package com.shbigdel.usergroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shbigdel.usergroup.entity.UserGroup;
import com.shbigdel.usergroup.service.UserGroupService;
import com.shbigdel.usergroup.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping ("/usergroups")
@Slf4j
public class UserGroupController {
	
	@Autowired
	private UserGroupService userGroupService;
	
	@PostMapping("/")
	public UserGroup saveUserGroup (@RequestBody UserGroup useGroup) {
		log.info("Saving User");
		return userGroupService.saveUserGroup(useGroup);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserGroupWithPolicy (@PathVariable("id") Long userGroupId) {
		log.info("finding User Groups");
		return userGroupService.getUserGroupWithPolicy(userGroupId);
	}

}
