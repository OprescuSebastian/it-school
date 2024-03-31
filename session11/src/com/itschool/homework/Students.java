package com.itschool.homework;

public class Students {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private long CNP;
    private String Gender;
    private String Adress;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public String getGender() {
        return Gender;
    }

    public String getAdress() {
        return Adress;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String firstName, String lastName, String dateOfBirth, long CNP, String gender, String adress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        Gender = gender;
        Adress = adress;
        this.age = age;


    }
}
