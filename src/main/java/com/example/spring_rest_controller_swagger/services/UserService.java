package com.example.spring_rest_controller_swagger.services;

import com.example.spring_rest_controller_swagger.entities.User;
import com.example.spring_rest_controller_swagger.exceptions.CustomBadRequestException;
import com.example.spring_rest_controller_swagger.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user){
        User existUser = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User with this ID not found!"));;
        existUser.setUsername(user.getUsername());
        existUser.setBookList(user.getBookList());

        return userRepository.save(existUser);
    }

    public void deleteUser(Long id){
        //check and throw if not exist
        userRepository.findById(id).orElseThrow(()-> new RuntimeException("User with this ID not found!"));
        //delete if exist
        userRepository.deleteById(id);
    }

    public User findUser(Long id){
        return userRepository.findById(id).orElseThrow(()-> new CustomBadRequestException("User with this ID not found!"));
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}
