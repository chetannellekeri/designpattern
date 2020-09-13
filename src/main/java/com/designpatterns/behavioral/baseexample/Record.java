package com.designpatterns.behavioral.baseexample;

/**
 * Template design pattern is one among behavioral design pattern
 * Defn: Template design pattern is to define an algorithm as a skeleton of operations and leave the details to be implemented by the child classes
 *
 * In this example save() is an template method. beforeSave() and afterSave() is a operations.
 *
 */
public abstract class Record {

    public boolean save() {

        this.beforeSave();

        System.out.println("Record Saved!");

        this.afterSave();

        return false;
    }

    public abstract boolean beforeSave();

    public abstract boolean afterSave();

}
