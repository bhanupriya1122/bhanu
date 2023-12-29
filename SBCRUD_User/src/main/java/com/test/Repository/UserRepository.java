package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}


