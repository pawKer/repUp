package com.cfg.repup.dao;

import com.cfg.repup.domain.Job;
import org.springframework.jdbc.core.JdbcTemplate;

public class JobDaoImpl implements JobDao {

    private final JdbcTemplate jdbcTemplate;

    public JobDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Job getData() {
        return null;
    }
}
