package com.mum.pm.user_module.service;

import com.mum.pm.user_module.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
