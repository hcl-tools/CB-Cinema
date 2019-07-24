package com.cinema.movies.services;


import com.cinema.movies.bean.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("RATING")
public interface RatingFeign {

    @RequestMapping("/API/all")
    List<Rating> getAll();

}
