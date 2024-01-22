package com.example.demo.idengeli;
import java.time.LocalDate;

//definition of class data
public class Idengeli {
    private long id;
    private String name;
    private int age;
    private String occupation;
    private char gender;
    private LocalDate dateOfBirth;
    private String email;

//    empty idengeli constructor
    public Idengeli() {
    }

    public Idengeli(long id, String name, int age, String occupation, char gender, LocalDate dateOfBirth, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }


    //Constuctor without ID because the DB will generate it for us
    public Idengeli(String name, int age, String occupation, char gender, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }


//    getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    next we add the toString constructor
    //**
    // The toString() method in Java is used to convert an object into a string, with the syntax: “. It's a part of the Object class and can be overridden for user-defined classes to provide a meaningful string representation of an object.


    @Override
    public String toString() {
        return "Idengeli{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", email='" + email + '\'' +
                '}';
    }
}
