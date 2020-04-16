package Aop.service.impl;

import Aop.dao.UserDao;
import Aop.pojo.User;
import Aop.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);

	}

}
