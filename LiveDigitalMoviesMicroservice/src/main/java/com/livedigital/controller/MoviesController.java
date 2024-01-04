package com.livedigital.controller;



import com.livedigital.entity.Movies;
import com.livedigital.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @PostMapping("/save")
    public Movies save(@RequestBody Movies movies){
        return moviesService.save(movies);
    }

    @PutMapping("/update")
    public Movies updateMovie(@RequestBody Movies movie) {
        return moviesService.updateMovie(movie);
    }

    @DeleteMapping("/movies/{id}")
    public void deleteMoviesById(@PathVariable("id") int movieId){
        moviesService.delete(movieId);
    }
    @GetMapping("/getList")
    public List<Movies> getMoviesList(){
        return moviesService.getMoviesList();
    }

    @GetMapping("/movies/noReviews")
    public List<Movies> getNoReviewMovieList() {
        List<Movies> movieList = moviesService.getNoReviewMovieList();
        return movieList;
    }

//    @GetMapping("/genres")
//    public List<Genre> getGenreList() {
//        List<Genre> genreList = genreRepository.findAll();
//        return genreList;
//    }

    @GetMapping("/movies/{id}")
    public Movies getMovieById(@PathVariable(value = "id") Integer id) {
        Movies existingMovie = moviesService.getMovieById(id);
        return existingMovie;
    }

    @GetMapping("/movies/checkForOneYearOld/{id}")
    public Boolean movieOlderThanOneYear(@PathVariable(value = "id") Integer id) {
        Boolean existingMovie = moviesService.movieOlderThanOneYear(id);
        if(existingMovie != null)
            return true;
        else
            return false;

    }

    @GetMapping("/movies/withActor/{id}")
    public List<Movies> getMoviesByActorId(@PathVariable(value = "id") Integer id) {
        List<Movies> existingMovie = moviesService.getMoviesByActorId(id);
        return existingMovie;
    }

}
