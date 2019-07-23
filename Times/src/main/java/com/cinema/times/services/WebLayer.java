package com.cinema.times.services;


import com.cinema.times.bean.Time;
import com.cinema.times.dao.TimeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/API")
public class WebLayer {


    @Autowired
    private TimeRepo timeRepo;

    @RequestMapping("/All")
    public List<Time> getAll() {
        return timeRepo.findAll();
    }


    @RequestMapping("/get/{id}")
    public Time getTime(@RequestParam("id") int id) {
        return timeRepo.findById(id).orElse(null);
    }
}
