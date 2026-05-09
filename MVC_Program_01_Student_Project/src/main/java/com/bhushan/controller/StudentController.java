package com.bhushan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bhushan.model.Student;
@Controller
public class StudentController {

@GetMapping("/student")
public String showStudent(Model model) {

    
    Student student = new Student(
            "Bhushan",
            101,
            "Java Full Stack"
    );

    
    model.addAttribute("stu", student);

    return "student";
}
}