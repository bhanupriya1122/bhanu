package com.livedigital.controller;


import com.livedigital.entity.Review;
import com.livedigital.service.ReviewService;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
@CrossOrigin("*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @Autowired
    private Environment environment;

    @GetMapping("/intance")
    public String getProperties(){
        String microservicePort =   environment.getProperty("local.server.port");
        return microservicePort;
    }

    @GetMapping("/getReviewList")
    public List<Review> getReviewList(){

      return  reviewService.getReviewList();
    }
    @GetMapping("/getReviewById/{id}")
    public Review getReviewById(@PathVariable(value="id") Integer id){
        return reviewService.getReviewById(id);
    }
    @PostMapping("/save")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }
    @GetMapping("/update")
    public Review updateReview(@PathVariable(value="id") Integer id, @RequestBody Review review){
        return reviewService.updateReview(id,review);
    }

    @DeleteMapping("/deleteReviewById/{id}")
    public void deleteReviewById(@PathVariable(value="id") Integer id) {
        Review existingReview = reviewService.deleteReviewById(id);
        //reviewService.(existingReview);

    }

}
