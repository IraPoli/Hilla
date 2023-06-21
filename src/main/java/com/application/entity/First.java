package com.application.entity;

import jakarta.validation.constraints.NotNull;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



//@Table(name = "First")
@Entity
public class First {

    @Id
    @GeneratedValue//(strategy = IDENTITY)//(strategy = GenerationType.AUTO)
    private  Long id;
    @NotNull
    private String task;
    @NotNull
    private  boolean done;


    public First(String task) {
        this.task = task;
    }

    public First() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
