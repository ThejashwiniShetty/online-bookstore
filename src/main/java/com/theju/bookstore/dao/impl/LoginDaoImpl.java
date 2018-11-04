package com.theju.bookstore.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.theju.bookstore.dao.LoginDao;
import com.theju.bookstore.domain.RolesDetail;

@Repository
public class LoginDaoImpl extends BaseDaoImpl implements LoginDao {

	@Transactional
	public RolesDetail getRoleById(int roleId) {
		return super.fetchEntityById(RolesDetail.class, roleId);
	}

}
