package com.cinema.movies.bean;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private String description;
    private Date releaseYear;
    @Transient
    private Rating rating;
    @Transient
    private List<Comment> comments;

    public Movie() { }

    public Movie(int id, String name, String category, String description, Date releaseYear, Rating rating, List<Comment> comments) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
