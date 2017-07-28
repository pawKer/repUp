package com.cfg.repup.dao;

import com.cfg.repup.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl {

    private final JdbcTemplate jdbcTemplate;

    public DaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee getData() {
        return null;
    }




}
