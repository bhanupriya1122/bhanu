package com.test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.Entity.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story, String>
{
}


