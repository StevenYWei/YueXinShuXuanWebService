package org.yuexinshuxuan.ws.dao;

import org.yuexinshuxuan.ws.entity.User;

public interface UsersDAO {
	
	public User getUserById(int userId);
	
	public User addUser(User userInfo);
	
	public int deleteUserById(int userId);
	
	public int updateUserCode(int userId, String userCode);
	
	public int updateUserActiveFlag(int userId, String activeFlag);
	
}
