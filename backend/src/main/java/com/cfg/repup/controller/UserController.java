package com.cfg.repup.controller;

import com.cfg.repup.dao.UserDaoImpl;
import com.cfg.repup.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserDaoImpl userDaoImpl;

	public UserController(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

    @GetMapping("/{userId}")
    public User getUser(@PathVariable final int userId) {
        return userDaoImpl.getData(userId);
    }

}
