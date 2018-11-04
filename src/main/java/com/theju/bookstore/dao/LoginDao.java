package com.theju.bookstore.dao;

import com.theju.bookstore.domain.RolesDetail;

public interface LoginDao extends BaseDao {

	RolesDetail getRoleById(int roleId);

}
