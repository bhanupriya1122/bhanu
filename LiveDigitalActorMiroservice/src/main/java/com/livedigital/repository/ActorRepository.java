package com.livedigital.repository;

import com.livedigital.entity.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actors,Integer> {
    List<Actors> findByFirstNameAndLastName(String firstName, String LastName);

}
