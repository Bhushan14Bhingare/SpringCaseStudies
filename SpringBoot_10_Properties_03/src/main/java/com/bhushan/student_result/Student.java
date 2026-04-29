package com.bhushan.student_result;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("${student.name}")
    private String name;

    @Value("${student.math}")
    private int math;

    @Value("${student.science}")
    private int science;

    @Value("${student.english}")
    private int english;

    @Value("#{${student.math} + ${student.science} + ${student.english}}")
    private int total;

    @Value("#{(${student.math} + ${student.science} + ${student.english}) / 3.0}")
    private double average;

    @Value("#{(${student.math} >= 35 and ${student.science} >= 35 and ${student.english} >= 35) ? 'PASS' : 'FAIL'}")
    private String result;

    public void displayResult() {
        System.out.println("-------------------------");
        System.out.println("Student Result Details");
        System.out.println("-------------------------");
        System.out.println("Student Name : " + name);
        System.out.println("Math Marks   : " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("English Marks: " + english);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Result Status: " + result);
    }
}