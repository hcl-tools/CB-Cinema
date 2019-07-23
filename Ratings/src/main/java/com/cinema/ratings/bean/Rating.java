package com.cinema.ratings.bean;

import javax.persistence.*;

@Entity
@Table(name = "Ratings")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movieid")
    private int movieId;
    private double rating;

    protected Rating() {
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
