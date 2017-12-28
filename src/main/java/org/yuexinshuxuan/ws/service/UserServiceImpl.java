package org.yuexinshuxuan.ws.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yuexinshuxuan.ws.dao.UsersDAO;
import org.yuexinshuxuan.ws.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersDAO userDao;
	
	@Override
	@Transactional
	public User getUserById(String userId) {
		return userDao.getUserById(Integer.parseInt(userId));
	}

	@Override
	@Transactional
	public User addUser(User userInfo) {
		return userDao.addUser(userInfo);
	}

	@Override
	@Transactional
	public void deleteUserById(String userId) {
		userDao.deleteUserById(Integer.parseInt(userId));
	}

	@Override
	@Transactional
	public void updateUserCode(String userId, String userCode) {
		userDao.updateUserCode(Integer.parseInt(userId), userCode);
	}

	@Override
	@Transactional
	public void updateUserActiveFlag(String userId, String activeFlag) {
		userDao.updateUserActiveFlag(Integer.parseInt(userId), activeFlag);

	}

}
