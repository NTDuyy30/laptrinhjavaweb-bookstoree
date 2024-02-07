package com.ttcn.service.impl;

import javax.inject.Inject;

import com.ttcn.dao.IUserDAO;
import com.ttcn.model.UserModel;
import com.ttcn.service.IUserService;

public class UserService implements IUserService {
	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModel findByUsernameAndPassword(String username, String password) {
		return this.userDAO.findByUsernameAndPassword(username, password);
	}

}
