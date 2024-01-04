package com.livedigital.service;


import com.livedigital.entity.Movies;
import com.livedigital.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;

    public Movies save(Movies movies){
        return moviesRepository.save(movies);
    }

    public Movies updateMovie(Movies movie) {
        // fetch the movie
//        Movies existingMovie = moviesRepository.findById(id).get();
//        existingMovie.setMovieId(movie.getMovieId());
//        existingMovie.setMovieTitle(movie.getMovieTitle());
//        existingMovie.setActorId(movie.getActorId());
//        existingMovie.setDuration(movie.getDuration());
//        // existingMovie.setGenreId(movie.getGenreId());
//        existingMovie.setOverview(movie.getOverview());
//        //existingMovie.setMovieUrl(movie.getMovieUrl());
//
//        existingMovie.setActorId(movie.getActorId());
//        existingMovie.setMovieCost(movie.getMovieCost());
//        existingMovie.setMovieYear(movie.getMovieYear());

        Movies savedMovie = moviesRepository.save(movie);
        return savedMovie;
    }
    public String delete(int movieId){
         moviesRepository.deleteById(movieId);
        return "Movie Deleted Sucessfully 1 Like Movie Id is :"+movieId;
    }
    public List<Movies> getMoviesList(){
        return moviesRepository.findAll();
    }

    public Movies getMovieById(Integer id) {
        Movies existingMovie = moviesRepository.findById(id).get();
        return existingMovie;
    }
    public List<Movies> getNoReviewMovieList() {
        List<Movies> movieList = moviesRepository.queryNoReviewMovies();
        return movieList;
    }

    public Boolean movieOlderThanOneYear(Integer id) {
        Movies existingMovie = moviesRepository.movieOlderThanOneYear(id);
        if(existingMovie != null)
            return true;
        else
            return false;

    }

    public List<Movies> getMoviesByActorId(@PathVariable(value = "id") Integer id) {
        List<Movies> existingMovie = moviesRepository.findByActorId(id);
        return existingMovie;
    }

    public Movies deleteMovieById(Integer id) {
        Movies deletedMovie = moviesRepository.findById(id).get();
        moviesRepository.delete(deletedMovie);
        return deletedMovie;
    }

}
