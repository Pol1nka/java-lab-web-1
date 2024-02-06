package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        Post post1 = new Post("hi");
        Post post2 = new Post("hello");
        Post post3 = new Post("privet");
        List<Post> posts = new ArrayList<>();

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;
    }
}
