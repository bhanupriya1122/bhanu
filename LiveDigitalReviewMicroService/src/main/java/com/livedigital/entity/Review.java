package com.livedigital.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY,generator="native")
    @Column(name="review_id")
    private int reviewId;
    @Column(name="date_posted", nullable = false)
    private Date datePosted;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name="rating", nullable = false)
    private int rating;
    @Column(name="movieId", nullable = false)
    private int movieId;



    public Review() {
    }

    public Review(Date datePosted, String description, int rating, int movieId) {

        this.datePosted = datePosted;
        this.description = description;
        this.rating = rating;
        this.movieId = movieId;
    }


    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
