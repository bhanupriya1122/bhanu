package com.livedigital.repository;

import com.livedigital.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies,Integer> {


    /*
     * The @Query annotation can be used to create queries by using the JPA query language
     * and to bind these queries directly to the methods of your repository interface.
     * When the query method is called, Spring Data JPA will execute the query specified by the @Query annotation
     */
    @Query(value = "select * from movies where not exists(select movie_id from reviews WHERE reviews.movie_id = movies.movie_id)",
            nativeQuery = true)
    List<Movies> queryNoReviewMovies();

    List<Movies> findByActorId(Integer actorId);

    //
    @Query (value =("SELECT * FROM movies WHERE  movie_year < DATE_SUB(NOW(),INTERVAL 1 YEAR) and movie_id = :movieId"),
            nativeQuery = true)
    Movies movieOlderThanOneYear(@Param("movieId") Integer movieId);
    @Query(value = ("DELETE movies,reviews FROM movies INNER JOIN reviews ON reviews.movie_id = movies.movie_id WHERE movies.movie_id = :movieId"),
            nativeQuery = true)
    Movies deleteMovieAndAssociatedReviews(@Param("movieId") Integer movieId);
}
