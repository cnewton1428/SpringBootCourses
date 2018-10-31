package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    @ManyToMany(mappedBy = "cast")
    private Set<Courses> course;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Courses> getCourse() {
        return course;
    }

    public void setCourse(Set<Courses> course) {
        this.course = course;
    }
}
