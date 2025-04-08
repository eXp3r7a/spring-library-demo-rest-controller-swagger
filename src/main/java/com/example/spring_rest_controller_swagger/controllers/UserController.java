package com.example.spring_rest_controller_swagger.controllers;

import com.example.spring_rest_controller_swagger.entities.User;
import com.example.spring_rest_controller_swagger.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user){
        return new ResponseEntity<>(userService.updateUser(id, user), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return new ResponseEntity<>("Successfully deleted user!", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id){
        return new ResponseEntity<>(userService.findUser(id), HttpStatus.OK);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
    }

}
