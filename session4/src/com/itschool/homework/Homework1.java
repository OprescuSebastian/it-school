package com.itschool.homework;

public class Homework1 {

    public static void main(String[] args) {

        String text1 = "Ana are mere.";
        //              12345678910111213
        String text2 = "Si Ionut are mere.";

        String text3 = " ";

        String a = text1.substring(0 ,12);

        System.out.println(a);

        String text4 = text2.toLowerCase();
        System.out.println(text4);
        System.out.println(a + text3 + text4);
    }
}

