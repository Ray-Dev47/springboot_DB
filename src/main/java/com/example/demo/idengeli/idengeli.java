package com.example.demo.idengeli;
import java.time.LocalDate;

public class idengeli {
    private long id;
    private String name;
    private int age;
    private String occupation;
    private char gender;
    private LocalDate dateOfBirth;
    private String email;

    public idengeli() {
    }

    public idengeli(long id, String name, int age, String occupation, char gender, LocalDate dateOfBirth, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

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
}
