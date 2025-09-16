package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //user operation

    User saveUser(User user);

    List<User> getAllUser();


    //get single user using user id
    User getUser(String userId);


    User upadateUser(User user);

    Boolean deletaUser(User user);


}
