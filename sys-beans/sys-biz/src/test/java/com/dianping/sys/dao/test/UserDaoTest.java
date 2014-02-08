package com.dianping.sys.dao.test;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.sys.dao.UserDao;
import com.dianping.sys.dao.test.base.TestBaseClass;
import com.dianping.sys.entity.User;

public class UserDaoTest extends TestBaseClass {

	@Autowired
	private UserDao userDao;

	private User userBuilder() {
		User user = new User();

		user.setUserID(1001);
		user.setUserName("Green");
		user.setCreatorID(1);
		user.setLastUpdatorID(1);
		user.setCreateTime(new Date(System.currentTimeMillis()));
		user.setLastUpdateTime(new Date(System.currentTimeMillis()));

		return user;
	}

	@Test
	public void testInsert() {
		User user = userBuilder();

		userDao.insert(user);
		
//		user.setId(userDao.insert(user));

//		Assert.assertEquals(true, user.getId() > 0);
	}
}
