package com.cfg.repup.dao;

import com.cfg.repup.domain.JobAssignment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
    public String getUsername(int id)
    {
    	return jdbcTemplate.queryForObject("SELECT user_name FROM users WHERE user_id =?", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString(1);
            }
        }, id);
    	
    }
    
    @Override
    public String getJobTitle(int id)
    {
    	return jdbcTemplate.queryForObject("SELECT title FROM jobs WHERE job_id =?", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                String name = resultSet.getString("title");
                return name;
            }
        }, id);
    	
    }

    @Override
    public boolean getJobComplete(int id) {
        return jdbcTemplate.queryForObject("SELECT complete FROM job_assignments WHERE job_id=?", new RowMapper<Boolean>() {
            @Override
            public Boolean mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getBoolean(1);
            }
        }, id);
    }

    @Override
    public int getJobRating(int id) {
        return jdbcTemplate.queryForObject("SELECT rating FROM job_assignments WHERE job_id=?", new RowMapper<Integer>() {
            @Override
            public Integer mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getInt(1);
            }
        }, id);
    }
}
