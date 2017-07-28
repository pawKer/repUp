package com.cfg.repup.dao;

import com.cfg.repup.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class JdbcDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Employee getData() {
		return jdbcTemplate.queryForObject("SELECT first_name, last_name FROM example", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
				Employee employee = new Employee();
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				return employee;
			}
		});
	}
}
