
package com.mycompany.facebook;

public class Post {
    public int id = 0; 
    public String content;


    public Post(String content) {
        this.content = content;
        this.id += 1;
    }
}
