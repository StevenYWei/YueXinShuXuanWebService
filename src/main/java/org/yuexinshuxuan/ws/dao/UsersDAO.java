package org.yuexinshuxuan.ws.dao;

import org.yuexinshuxuan.ws.entity.User;

public interface UsersDAO {
	
	public User getUserById(int userId);
	
	public User addUser(User userInfo);
	
	public void deleteUserById(String userId);
	
	public void updateUserCode(String userId, String userCode);
	
	public void updateUserActiveFlag(String userId, String activeFlag);
	
}
