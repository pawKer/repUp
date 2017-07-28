package com.cfg.repup.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cfg.repup.domain.Job;
import com.cfg.repup.domain.JobAssignment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class JobAssignmentDaoImpl implements JobAssignmentDao{

    private JdbcTemplate jdbcTemplate;

    public JobAssignmentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<JobAssignment> getData() {
    	return jdbcTemplate.query("SELECT * FROM job_assignments", new RowMapper<JobAssignment>() {
            @Override
            public JobAssignment mapRow(ResultSet resultSet, int i) throws SQLException {
                JobAssignment job = new JobAssignment(
                		resultSet.getInt("job_id"),
                        resultSet.getInt("job_owner"),
                        resultSet.getInt("factotum"),
                        resultSet.getBoolean("complete"),
                        resultSet.getInt("rating"));
                return job;
            }
        });
    }
    
    @Override
    public String getFactotum(Integer id)
    {
    	return jdbcTemplate.queryForObject("SELECT first_name FROM users WHERE user_id = " + id, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                String name = resultSet.getString("first_name");
                return name;
            }
        });
    	
    }
    
    @Override
    public String getJobTitle(Integer id)
    {
    	return jdbcTemplate.queryForObject("SELECT title FROM jobs WHERE job_id = " + id, new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                String name = resultSet.getString("title");
                return name;
            }
        });
    	
    }
}
