package com.designpatterns.behavioral.baseexample;

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
