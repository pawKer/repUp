package com.cfg.repup.controller;

import com.cfg.repup.dao.UserDao;
import com.cfg.repup.dao.UserDaoImpl;
import com.cfg.repup.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private final UserDaoImpl userDaoImpl;

	public UserController(UserDaoImpl userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}

    @GetMapping("/{userId}")
    public User getUser(@PathVariable final int userId) {
        return userDaoImpl.getUser(userId);
    }

    @GetMapping
    public List<User> getUsers() {
	    return userDaoImpl.getUsers();
    }

    @GetMapping("{userId}/photo")
    public String getUserProfile(@PathVariable final int userId) { return userDaoImpl.getUserProfilePhoto(userId);}

    @PostMapping()
    public void createUser(@RequestBody User user){
        userDaoImpl.createUser(user);
    }

    @PostMapping("/{userId}/rating")
    public void updateUserRating(){

    }


}
