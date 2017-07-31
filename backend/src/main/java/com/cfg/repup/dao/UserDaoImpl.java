package com.cfg.repup.dao;

import com.cfg.repup.domain.User;
import com.cfg.repup.domain.UserRating;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImpl implements UserDao{

    private final JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUser(int userId) {
        return jdbcTemplate.queryForObject("SELECT * FROM users WHERE user_id=?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(
                        resultSet.getString("user_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("mobile_number"),
                        resultSet.getString("card_number"),
                        resultSet.getFloat("user_rating"),
                        resultSet.getString("path_to_profile_photo"), resultSet.getInt("user_id"));
                return user;
            }
        }, userId);
    }

    @Override
    public List<User> getUsers() {
        return jdbcTemplate.query("SELECT * FROM users", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(
                        resultSet.getString("user_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("mobile_number"),
                        resultSet.getString("card_number"),
                        resultSet.getFloat("user_rating"),
                        resultSet.getString("path_to_profile_photo"), resultSet.getInt("user_id"));
                return user;
            }
        });
    }

    @Override
    public void createUser(final User newUser) {
        jdbcTemplate.update(
                "INSERT INTO users (user_name, first_name, last_name, mobile_number, card_number, user_rating, path_to_profile_photo)" +
                        "VALUES(?,?,?,?,?,?,?)", new PreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, newUser.getUser_name());
                        preparedStatement.setString(2, newUser.getFirstName());
                        preparedStatement.setString(3, newUser.getLastName());
                        preparedStatement.setString(4, newUser.getMobileNumber());
                        preparedStatement.setString(5, newUser.getCardNumber());
                        preparedStatement.setFloat(6, newUser.getUserRating());
                        preparedStatement.setString(7, newUser.getPath_to_profile_photo());
                    }});
    }

    @Override
    public List<UserRating> getHighestRated() {
        List<User> top20Users = jdbcTemplate.query("SELECT TOP 20 * FROM users ORDER BY user_rating DESC", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User(
                        resultSet.getString("user_name"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("mobile_number"),
                        resultSet.getString("card_number"),
                        resultSet.getFloat("user_rating"),
                        resultSet.getString("path_to_profile_photo"), resultSet.getInt("user_id"));
                System.out.println("HELOOOOOOOOOOOOOO" + user.getUserRating());
                return user;
            }
        });
        List<UserRating> topUsers = new ArrayList<UserRating>();
        for (User user: top20Users){
            int numberOfJobsCompletedByUser = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM job_assignments WHERE factotum=?", new RowMapper<Integer>(){
                @Override
                public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                    return rs.getInt(1);
                }
            }, user.getUser_id());
            topUsers.add(new UserRating(user.getUser_name(), user.getUserRating(), numberOfJobsCompletedByUser));
        }
        return topUsers;
    }

    @Override
    public String getUserProfilePhoto(int userId) {
        return jdbcTemplate.queryForObject("SELECT path_to_profile_photo FROM users WHERE user_id=?", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {

                return resultSet.getString(1);
            }
        }, userId);
    }
}
