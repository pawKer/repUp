package com.cfg.repup.dao;

import com.cfg.repup.domain.Job;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class JobDaoImpl implements JobDao {

    private final JdbcTemplate jdbcTemplate;

    public JobDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Job getJob(int jobId) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE job_id=?", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                Job job = new Job(resultSet.getInt("job_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"));
                return job;
            }
        }, jobId);
    }

    @Override
    public List<Job> getJobs() {
        return jdbcTemplate.query("SELECT * FROM jobs", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                Job job = new Job(resultSet.getInt("job_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"));
                return job;
            }
        });
    }
}
