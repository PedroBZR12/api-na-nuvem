package me.dio.api_na_nuvem.service;

import me.dio.api_na_nuvem.domain.model.User;


public interface UserService {


    User findById(Long id);

    User create(User userToCreate);
}
