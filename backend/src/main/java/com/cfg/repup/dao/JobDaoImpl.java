package com.cfg.repup.dao;

import com.cfg.repup.domain.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class JobDaoImpl extends DaoImpl {

    public JobDaoImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public Employee getData() {
        return null;
    }
}
