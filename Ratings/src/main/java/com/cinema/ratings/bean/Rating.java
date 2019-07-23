package com.cinema.ratings.bean;

public class Rating {

    private int id;
    private int movieId;
    private double rating;

    public Rating() {
    }

    public Rating(int id, int movieId, double rating) {
        this.id = id;
        this.movieId = movieId;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
