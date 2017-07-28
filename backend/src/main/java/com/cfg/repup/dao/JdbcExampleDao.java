package com.cfg.repup.dao;

import com.cfg.repup.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JdbcExampleDao implements ExampleDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcExampleDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee getData() {
		return jdbcTemplate.queryForObject("SELECT first_name, last_name FROM example", (resultSet, i) -> {
			Employee employee = new Employee();
			employee.setFirstName(resultSet.getString("first_name"));
			employee.setLastName(resultSet.getString("last_name"));

			return employee;
		});
	}
}
