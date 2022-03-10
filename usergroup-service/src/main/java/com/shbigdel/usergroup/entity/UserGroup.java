package com.shbigdel.usergroup.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long groupId;
	private String groupName;
	private Long policyId;

}
