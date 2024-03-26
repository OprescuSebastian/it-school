package com.itschool.course;

public class Course5PersonDemo {

    public static void main(String[] args) {
        Person ionutz = new Person();
        Person maria = new Person();
        Person laura = new Person();
        System.out.println(ionutz.getLastName());
        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());
        ionutz.setFirstName("ionutz");
        ionutz.setAge(32);
        ionutz.setCnp(191123412512314214L);
        System.out.println("Result after setting propertits");
        System.out.println(ionutz.getAge());
        System.out.println(ionutz.getCnp());
        System.out.println(ionutz.getFirstName());
    }
}
