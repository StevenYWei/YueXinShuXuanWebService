package org.yuexinshuxuan.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yuexinshuxuan.ws.entity.User;
import org.yuexinshuxuan.ws.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/profile/{userId}")
	public User getUserInfo(@PathVariable String userId) {
		return userService.getUserById(userId);
	}
	
	@PostMapping(value="addUser")
	public User addUser(@RequestBody User userInfo) {
		User usr = userService.addUser(userInfo);
		return usr;
	}
	
	@GetMapping("/remove/{userId}")
	public void removeUserById(@PathVariable String userId) {
		userService.deleteUserById(userId);
	}
	
	@GetMapping("/{userId}")
	public void updateUserStatus(@PathVariable String userId, @RequestParam(value="flag") String status) {
		userService.updateUserActiveFlag(userId, status);
	}

}
