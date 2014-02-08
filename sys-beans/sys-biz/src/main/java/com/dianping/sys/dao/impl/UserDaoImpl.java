package com.dianping.sys.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.dianping.sys.dao.UserDao;
import com.dianping.sys.entity.User;

public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

	@Override
	public User findById(int userID) {
		return (User) getSqlMapClientTemplate().queryForObject("User.findById",
				userID);
	}

	@Override
	public int insert(User user) {
		return (Integer) getSqlMapClientTemplate().insert("User.insert", user);
	}

	@Override
	public void update(User user) {
		getSqlMapClientTemplate().update("User.update", user);
	}

	@Override
	public void remove(User user) {
		getSqlMapClientTemplate().delete("User.remove", user);
	}

}
