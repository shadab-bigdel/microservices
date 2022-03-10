package com.shbigdel.user.vo;

import com.shbigdel.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseTemplateVO {

	private User user;
	private UserGroup userGroup;
	private Policy policy;

}
