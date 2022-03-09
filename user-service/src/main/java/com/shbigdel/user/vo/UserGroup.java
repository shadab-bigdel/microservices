package com.shbigdel.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGroup {	
	
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;

	
}
