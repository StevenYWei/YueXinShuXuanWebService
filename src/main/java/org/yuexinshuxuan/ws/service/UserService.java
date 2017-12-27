package org.yuexinshuxuan.ws.service;

import org.yuexinshuxuan.ws.entity.User;

public interface UserService {

	public User getUserById(String userId);

	public User addUser(User userInfo);

	public void deleteUserById(String userId);

	public void updateUserCode(String userId, String userCode);

	public void updateUserActiveFlag(String userId, String activeFlag);

}
