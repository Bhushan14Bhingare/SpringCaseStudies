package com.bhushan.model;

public class Student {

	private String name;
    private int rollNo;
    private String course;

    // Constructor
    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }
}
