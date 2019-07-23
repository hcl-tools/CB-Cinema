package com.cinema.times.dao;

import com.cinema.times.bean.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepo extends JpaRepository<Time, Integer> {
}
