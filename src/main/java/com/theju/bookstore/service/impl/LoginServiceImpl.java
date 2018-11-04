package com.theju.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theju.bookstore.dao.LoginDao;
import com.theju.bookstore.domain.RolesDetail;
import com.theju.bookstore.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	public RolesDetail getRoleById(int roleId) {
		return this.loginDao.getRoleById(roleId);
	}

}
