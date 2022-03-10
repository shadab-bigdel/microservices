package com.shbigdel.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shbigdel.policy.entity.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

	public Policy findByPolicyId(Long policyId);

}
