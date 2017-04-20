package com.mum.pm.usermodule.service;

import com.mum.pm.usermodule.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
