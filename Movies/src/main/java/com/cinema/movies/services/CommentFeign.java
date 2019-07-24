package com.cinema.movies.services;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("COMMENT")
public interface CommentFeign {
}
