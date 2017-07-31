package com.cfg.repup.dao;

import com.cfg.repup.domain.Job;
import com.cfg.repup.domain.User;
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
        return jdbcTemplate.queryForObject("SELECT TOP 1 * FROM jobs WHERE job_id=?", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                Job job = new Job(resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getTimestamp("date_posted"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"),
                        resultSet.getInt("likes"),
                        resultSet.getInt("expected_duration"),
                        resultSet.getString("categories"),
                        resultSet.getString("charities"),
                        null,
                        resultSet.getInt("job_id"));
                return job;
            }
        }, jobId);
    }

    @Override
    public List<Job> getJobs() {
        return jdbcTemplate.query("SELECT * FROM jobs j LEFT JOIN users u ON u.user_id=j.job_owner", new RowMapper<Job>() {
            @Override
            public Job mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(
                        resultSet.getString("user_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("mobile_number"),
                        resultSet.getString("card_number"),
                        resultSet.getFloat("user_rating"),
                        resultSet.getString("path_to_profile_photo"),
                        resultSet.getInt("user_id"));

                Job job = new Job(resultSet.getString("title"),
                        resultSet.getString("description"),
                        resultSet.getTimestamp("date_posted"),
                        resultSet.getString("remuneration"),
                        resultSet.getInt("job_owner"),
                        resultSet.getInt("likes"),
                        resultSet.getInt("expected_duration"),
                        resultSet.getString("categories"),
                        resultSet.getString("charities"),
                        user,
                        resultSet.getInt("job_id"));
                return job;
            }
        });
    }

    @Override
    public void createJob(final Job newJob, int userId) {
        jdbcTemplate.update(
                "INSERT INTO jobs (title, description, remuneration, date_posted, job_owner, likes, expected_duration, categories, charities) " +
                        "VALUES(?,?,?,?,?,?,?,?,?)", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setString(1, newJob.getTitle());
                preparedStatement.setString(2, newJob.getDescription());
                preparedStatement.setString(3, newJob.getRemuneration());
                preparedStatement.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
                preparedStatement.setInt(5, newJob.getJob_owner());
                preparedStatement.setInt(6, newJob.getlikes());
                preparedStatement.setInt(7, newJob.getExpected_duration());
                preparedStatement.setString(8, newJob.getCategory());
                preparedStatement.setString(9, newJob.getCharity());
            }});
    }

    @Override
    public void assignJob(final int jobId, final int userId) {
        jdbcTemplate.update(
                "INSERT INTO job_assignments(job_id, factotum, complete, rating) " +
                        "VALUES(?, ?, ?, ?)", new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setInt(1, jobId);
                        preparedStatement.setInt(2, userId);
                        preparedStatement.setBoolean(3, false);
                        preparedStatement.setInt(4, 0);
                    }});
    }
}
