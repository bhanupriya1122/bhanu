package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Story;
import com.test.Repository.StoryRepository;

@RestController
@RequestMapping(value = "/story")
public class StoryController {
	@Autowired
    StoryRepository storyRepository;
    @ResponseBody
    @RequestMapping(value = "/stories")
    public List<Story> getBookDetails() {
        List<Story> storyresponse = (List<Story>) storyRepository.findAll();
        return storyresponse;
    }
}

