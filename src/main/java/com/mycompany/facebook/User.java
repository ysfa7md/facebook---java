package com.mycompany.facebook;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id = 0;

    public String name;
    public String gender;
    public String dateOfBirth;

    protected String email;
    protected String password;
    
    public boolean isLogged = false;
    
    // to make infinity posts use list
    private List<Post> posts = new ArrayList<>();


    // constructor
    public User(String data) {
        String[] parts = data.split(","); // Assuming CSV format
        this.name = parts[0];
        this.email = parts[1];
        this.password = parts[2];
        this.gender = parts[3];
        this.dateOfBirth = parts[4];
        this.id += 1;
    }

    public User(String name, String email, String password, String gender, String dateOfBirth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.id += 1;
    }
    
    public String toString() {
        return String.join(",", name, email, password, gender, dateOfBirth);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    // to get posts from object
    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }




}

