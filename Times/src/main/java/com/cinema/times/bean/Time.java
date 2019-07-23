package com.cinema.times.bean;


import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table( name = "sessionTimes")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "movieid")
    private int movieId;
    private LocalDateTime sessionTime;

    protected Time() {
    }

    public Time(int id, int movieId, LocalDateTime sessionTime) {
        this.id = id;
        this.movieId = movieId;
        this.sessionTime = sessionTime;
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

    public LocalDateTime getSessionTime() {
        return sessionTime;
    }

    public void setSessionTime(LocalDateTime sessionTime) {
        this.sessionTime = sessionTime;
    }
}
