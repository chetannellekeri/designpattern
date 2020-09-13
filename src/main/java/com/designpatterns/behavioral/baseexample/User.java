package com.designpatterns.behavioral.baseexample;

public class User extends Record {

    public boolean beforeSave() {

        System.out.println("Before user saved!");

        return true;
    }

    public boolean afterSave() {

        System.out.println("After user saved!");

        return true;
    }
}
