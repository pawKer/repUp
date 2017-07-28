package com.cfg.repup.dao;

import com.cfg.repup.domain.JobAssignment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class JobAssignmentDaoImpl implements JobAssignmentDao{

    private JdbcTemplate jdbcTemplate;

    public JobAssignmentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JobAssignment getData() {
        return null;
    }
}
