package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface RatingService {


    Rating create(Rating rating);

    List<Rating> getRating();


     List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);


}
