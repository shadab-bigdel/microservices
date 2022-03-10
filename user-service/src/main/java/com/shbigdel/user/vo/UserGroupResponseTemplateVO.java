package com.shbigdel.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGroupResponseTemplateVO {

	private UserGroup userGroup;
	private Policy policy;

}
