package com.dianping.sys.dao;

import com.dianping.sys.entity.User;

public interface UserDao {
	public User findById(int userID);

	public void insert(User user);

	public void update(User user);
	
	public void remove(User user);
}
