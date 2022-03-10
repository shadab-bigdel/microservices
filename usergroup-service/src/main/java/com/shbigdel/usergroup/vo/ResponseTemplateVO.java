package com.shbigdel.usergroup.vo;

import com.shbigdel.usergroup.entity.UserGroup;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	private UserGroup userGroup;
	private Policy policy;

}
