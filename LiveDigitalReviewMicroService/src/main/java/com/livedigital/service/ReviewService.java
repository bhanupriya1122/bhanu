package com.livedigital.service;


import com.livedigital.entity.Review;
import com.livedigital.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewList() {
        List<Review> reviewList = reviewRepository.findAll();
        return reviewList;
    }

    public Review getReviewById(Integer id) {
        Review existingReview = reviewRepository.findById(id).get();
        return existingReview;
    }

    public Review createReview(Review review) {
        Review savedReview = reviewRepository.save(review);
        return savedReview;
    }

    public Review updateReview( Integer id,Review review) {
        // fetch the review
        Review existingReview = reviewRepository.findById(id).get();
        existingReview.setReviewId(review.getReviewId());
        existingReview.setDatePosted(review.getDatePosted());
        existingReview.setDescription(review.getDescription());
        existingReview.setRating(review.getRating());
        existingReview.setMovieId(review.getMovieId());


        Review savedReview = reviewRepository.save(review);
        return savedReview;
    }

    public Review deleteReviewById(Integer id) {
        Review existingReview = reviewRepository.findById(id).get();
        reviewRepository.delete(existingReview);
        return existingReview;
    }

}
