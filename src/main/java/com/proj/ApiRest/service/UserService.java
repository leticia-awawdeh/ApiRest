package com.proj.ApiRest.service;

import com.proj.ApiRest.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
