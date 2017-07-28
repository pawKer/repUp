package com.cfg.repup.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl extends DaoImpl {

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }



}
