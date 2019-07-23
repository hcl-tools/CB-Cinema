package com.cinema.ratings.services;

import com.cinema.ratings.bean.Rating;
import com.cinema.ratings.dao.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API/")
public class WebLayer {

    @Autowired
    private RatingRepo ratingRepo;

    @RequestMapping("/get/{id}")
    public Rating getRating(@PathVariable("id") int id) {
        return ratingRepo.findById(id).orElse(null);
    }

    @RequestMapping("/all")
    public List<Rating> getAll() {
        return ratingRepo.findAll();
    }
}

