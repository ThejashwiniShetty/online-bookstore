package com.theju.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.theju.bookstore.domain.RolesDetail;
import com.theju.bookstore.service.LoginService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/role/{roleId}", method = RequestMethod.GET)
	public RolesDetail getRoleById(@PathVariable("roleId") int roleId) {  
		RolesDetail rolesDetail = loginService.getRoleById(roleId);
		System.out.println("Role Name for roleId is: "+rolesDetail.getRoleName());
		return rolesDetail;
	}  

}