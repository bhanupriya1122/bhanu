package com.livedigital.entity;

import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    private String movieTitle;
    private int movieCost;
    private int movieYear;
    @Column(name="ACTOR_ID", nullable = false)
    private Integer actorId;

    @Column(name="DURATION", nullable = false)
    private String duration;

    @Column(name="OVERVIEW", nullable = false)
    private String overview;


    public Movies() {
    }

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Movies(int movieId, String movieTitle, int movieCost, int movieYear, Integer actorId, String duration, String overview) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieCost = movieCost;
        this.movieYear = movieYear;
        this.actorId = actorId;
        this.duration = duration;
        this.overview = overview;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieCost() {
        return movieCost;
    }

    public void setMovieCost(int movieCost) {
        this.movieCost = movieCost;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }
}
