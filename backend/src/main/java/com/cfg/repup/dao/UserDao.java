package com.cfg.repup.dao;

import com.cfg.repup.domain.User;

import java.util.List;

public interface UserDao {

    User getUser(int userId);

    List<User> getUsers();
}
