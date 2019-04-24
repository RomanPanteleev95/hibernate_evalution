package com.security.service;

public interface SecurityService {
    String findLoggedUserName();
    void autoLogin(String userName, String password);
}
