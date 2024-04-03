package com.itschool.homework;

public class HomeworkEx1 {

    public static void main(String[] args) {
        Techers George = new Techers("Diaconescu", "George",
                "Male", 30,"30/05/1994", 1944213423421L,
                "Targoviste Str.Stefan Cel Mare Bl.4 Ap.3");

        Students Ion = new Students("Ivascu", "Ion","Male",
                20, "12/2/2004", 2044215612231L,
                "Targoviste Bl. Unirii Bl.4 Ap.6 Et.3");

        Students Alina = new Students("Popescu","Alina","Female",
                19,"01/04/2005",2057694924592L,
                "Dumbrava Str.Principala Nr201");

        Techers Lavinia = new Techers("Popovici","Lavinia","Female",
                33,"23/09/1991",1914582934129L,
                "Viisoara Str.Bisericii Nr.192");

        Courses Math = new Courses("Math","from 12:00 to 13:00",
                60,"Lavinia");

    }
}
