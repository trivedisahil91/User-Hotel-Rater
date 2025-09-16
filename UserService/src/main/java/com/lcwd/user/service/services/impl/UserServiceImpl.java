package com.lcwd.user.service.services.impl;

import com.lcwd.user.service.entities.Hotel;
import com.lcwd.user.service.entities.Rating;
import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.external.service.HotelService;
import com.lcwd.user.service.repositories.UserRepository;
import com.lcwd.user.service.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HotelService hotelService;

    @Override
    public User saveUser(User user) {
        String rendomUserId=UUID.randomUUID().toString();
        user.setUserId(rendomUserId);

        userRepository.save(user);
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();

    }

    @Override
    public User getUser(String userId) {
        User user=userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on the server ! :"+userId));
        Rating[] ratingsOfUser=restTemplate.getForObject("http://RATING-SERVICE/ratings/user/"+userId, Rating[].class);
        List<Rating> ratings= Arrays.stream(ratingsOfUser).toList();
        log.info("{}",ratingsOfUser);



        List<Rating> ratingList=ratings.stream().map(rating -> {
            //ResponseEntity<Hotel> forEntity=restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelId(), Hotel.class);
//          Hotel hotel=forEntity.getBody(); //for RestTemplate
//
//
            Hotel hotel=hotelService.getHotel(rating.getHotelId()); //for Feign Client
            rating.setHotel(hotel);

            //log.info("{}",forEntity.getStatusCode()); //for ReastTemplate

            return rating;
        }).collect(Collectors.toList());

        user.setRatings(ratingList);


        return user;
    }

    @Override
    public User upadateUser(User user) {

        return null;
    }

    @Override
    public Boolean deletaUser(User user) {
        boolean a=false;
        try {
            if (!user.equals("") && user != null) {
                userRepository.delete(user);
                a=true;
            }
        } catch (Exception e) {
            log.error("Exception", e);
             a=false;

        }
        if (a!=true)
            return a;
        else
            return true;
    }




}
