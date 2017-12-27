package org.yuexinshuxuan.ws.service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.dao.UsersDAO;
import org.yuexinshuxuan.ws.entity.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDAO userDao;
	
	@Override
	public User getUserById(String userId) {
		
		User user = userDao.getUserById(Integer.parseInt(userId));
		return user;
	}

	@Override
	@Transactional
	public User addUser(User userInfo) {
		return userDao.addUser(userInfo);
	}

	@Override
	public void deleteUserById(String userId) {
		userDao.deleteUserById(userId);
	}

	@Override
	public void updateUserCode(String userId, String userCode) {
		userDao.updateUserCode(userId, userCode);
	}

	@Override
	public void updateUserActiveFlag(String userId, String activeFlag) {
		userDao.updateUserActiveFlag(userId, activeFlag);

	}

}
