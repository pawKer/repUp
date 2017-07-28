package com.cfg.repup.controller;

import com.cfg.repup.dao.ExampleDao;
import com.cfg.repup.domain.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

	private final ExampleDao exampleDao;

	public ExampleController(ExampleDao exampleDao) {
		this.exampleDao = exampleDao;
	}

	@RequestMapping
	public Employee hello() {
		return exampleDao.getData();
	}

}
