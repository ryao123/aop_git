package Aop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import Aop.dao.UserDao;
import Aop.pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void saveUser(User user) {
		List<User> list=new ArrayList<User>();
		list.add(user);
		System.out.println("增加用户信息成功。");
	}

}
