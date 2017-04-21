package com.mum.pm.user_module.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
