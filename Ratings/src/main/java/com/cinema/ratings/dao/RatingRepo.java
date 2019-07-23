package com.cinema.ratings.dao;

import com.cinema.ratings.bean.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating, Integer> {
}
