package com.livedigital.service;


import com.livedigital.entity.Actors;
import com.livedigital.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    public Actors save(Actors actor){
        return actorRepository.save(actor);
    }

    public Actors update(Actors actor){
        return actorRepository.save(actor);
    }

    public List<Actors> getList() {

        return actorRepository.findAll();
    }

     public String delete(int actorId){

         actorRepository.deleteById(actorId);

       return "Deleted sucessfully ! ActorId is "+actorId;
     }

    public Optional<Actors> findById(Integer actorId) {
        
        return actorRepository.findById(actorId);
    }
}
