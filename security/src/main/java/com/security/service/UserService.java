package com.security.service;

import com.security.model.User;

public interface UserService {
    void save(User user);
    User findByUserName(String userName);
}
