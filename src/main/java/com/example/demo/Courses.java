package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String Instructor;
    private int credits;
    private String description;

    @ManyToMany
    private Set<Students> cast;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String instructor) {
        Instructor = instructor;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Students> getCast() {
        return cast;
    }

    public void setCast(Set<Students> cast) {
        this.cast = cast;
    }
}
