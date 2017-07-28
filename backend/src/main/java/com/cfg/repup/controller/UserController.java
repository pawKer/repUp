package com.cfg.repup.controller;

import com.cfg.repup.dao.ExampleDao;
import com.cfg.repup.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	private final ExampleDao exampleDao;

	public UserController(ExampleDao exampleDao) {
		this.exampleDao = exampleDao;
	}


	/* public Employee hello() {
		return exampleDao.getData();
	} */

	@GetMapping("/{username}")
	public User getUser(@PathVariable final String userName) {
		//return exampleDao.getData(userName);
		return null;
	}

}
