package com.itschool.homework;

public class Techers {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private long CNP;
    private String adress;

    public Techers(String firstName, String lastName, String sex,
                   int age, String dateOfBirth, long CNP, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.CNP = CNP;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public long getCNP() {
        return CNP;
    }

    public String getAdress() {
        return adress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCNP(long CNP) {
        this.CNP = CNP;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
