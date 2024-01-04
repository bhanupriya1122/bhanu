package com.livedigital.controller;


import com.livedigital.entity.Actors;
import com.livedigital.repository.ActorRepository;
import com.livedigital.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//SELF-DESCRIPTIVE, CONCISE, underlying principles , best pracs  standard conventions
//actor, actors
//actor(resource) / actors (collection of resources)
// HTTP Verb : GET, PUT, POST, DELETE
// GET actors, Get actor
// POST actors  / actor

//http://domain-name:port/resource    : get, post, put, deete
@RequestMapping("/actors")
@CrossOrigin(origins ="*")
public class ActorController {

    @Autowired
    private ActorService actorService;
    @Autowired
    private ActorRepository actorRepository;

    @PostMapping("/save")
    public Actors save(@RequestBody Actors actors) {
        return actorService.save(actors);
    }


    @GetMapping("/getList")
    public List<Actors> getList() {
        return actorService.getList();
    }
    @PutMapping("/update")
    public Actors update(@RequestBody Actors actors) {
        return actorService.update(actors);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Integer actorId){
        System.out.println(actorId);
        String str=actorService.delete(actorId);
        System.out.println(str);
        //return ResponseEntity.ok(str);
    }
    @GetMapping("/find/{id}")
    public Optional<Actors> findById(@PathVariable("id") Integer actorId){
        return actorService.findById(actorId);
    }
}
