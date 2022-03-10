package com.shbigdel.usergroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shbigdel.usergroup.entity.UserGroup;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

	public UserGroup findByGroupId(Long userId);

}
