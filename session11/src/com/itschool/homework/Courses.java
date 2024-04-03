package com.itschool.homework;

public class Courses {
    
    private String Course;
    private String Schedule;
    private int Duration;
    private Techers Techer;

    public Courses(String course, String schedule, int duration, Techers techer) {
        Course = course;
        Schedule = schedule;
        Duration = duration;
        Techer = techer;
    }

    public Courses(String math, String schedule, int duration, String lavinia) {
    }

    public String getCourse() {
        return Course;
    }

    public String getSchedule() {
        return Schedule;
    }

    public int getDuration() {
        return Duration;
    }

    public Techers getTecher() {
        return Techer;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public void setTecher(Techers techer) {
        Techer = techer;
    }
}
