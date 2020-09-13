package com.designpatterns.behavioral.baseexample;

public class Post extends Record {

    public boolean beforeSave() {

        System.out.println("Before Post Save");
        return true;
    }

    public boolean afterSave() {

        System.out.println("After Post Save");
        return false;
    }
}
