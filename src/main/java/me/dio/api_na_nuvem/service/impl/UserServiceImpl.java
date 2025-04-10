package me.dio.api_na_nuvem.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.api_na_nuvem.domain.model.User;
import me.dio.api_na_nuvem.repository.UserRepository;
import me.dio.api_na_nuvem.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    
    

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("Esse usuário já existe");
        }
        return userRepository.save(userToCreate);
    }

}
