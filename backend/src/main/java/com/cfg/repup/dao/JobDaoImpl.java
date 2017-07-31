package com.cfg.repup.dao;

import com.cfg.repup.domain.Job;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Component
public class JobDaoImpl implements JobDao {

    private final JdbcTemplate jdbcTemplate;

    public JobDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Job getJob(int jobId) {
        return jdbcTemplate.queryForObject("SELECT * FROM jobs WHERE job_id=?", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                Job job = new Job(resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getTimestamp("date_posted"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"),
                        resultSet.getInt("likes"),
                        resultSet.getInt("expected_duration"));
                return job;
            }
        }, jobId);
    }

    @Override
    public List<Job> getJobs() {
        return jdbcTemplate.query("SELECT * FROM jobs", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                Job job = new Job(resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getTimestamp("date_posted"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"),
                        resultSet.getInt("likes"),
                        resultSet.getInt("expected_duration"));
                return job;
            }
        });
    }

    @Override
    public void createJob(final Job newJob) {
        jdbcTemplate.update(
                "INSERT INTO jobs (title, description,date_posted,remuneration, job_owner, likes, expected_duration) " +
                        "VALUES(?,?,?,?,?,?,?)", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1, newJob.getTitle());
                preparedStatement.setString(2, newJob.getDescription());
                preparedStatement.setTimestamp(3, new Timestamp(newJob.getDatePosted().getTime()));
                preparedStatement.setString(4, newJob.getRemuneration());
                preparedStatement.setInt(5, newJob.getJob_owner());
                preparedStatement.setInt(6, newJob.getlikes());
                preparedStatement.setInt(7, newJob.getExpected_duration());
            }});
    }

    @Override
    public void assignJob(final int jobId, final int userId) {
        jdbcTemplate.update(
                "INSERT INTO job_assignments(job_id, factotum, complete, rating" +
                        "VALUES(?, ?, ?, ?, ?)", new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, jobId);
                        preparedStatement.setInt(3, userId);
                        preparedStatement.setBoolean(4, false);
                        preparedStatement.setInt(5, 0);
                    }});
    }
}
