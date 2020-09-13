package com.designpatterns.behavioral.baseexample;

public class App {

    public static void main(String[] args) {
        User user = new User();
        user.save();

        Post post = new Post();
        post.save();
    }
}
