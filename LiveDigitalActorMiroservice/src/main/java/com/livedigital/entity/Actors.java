package com.livedigital.entity;

import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int actorId;
   private String firstName;
   private String lastName;
   private String gender;
   private int age;

    public Actors() {
    }

    public Actors(String firstName, String lastName, String gender, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
