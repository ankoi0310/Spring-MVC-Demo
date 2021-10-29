package com.koi.demo.controller;

import com.koi.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        // Create student object
        Student student = new Student();

        // Assign student object to Model bean for binding data
        model.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processStudentForm")
    public String processForm(@Valid @ModelAttribute("student") Student student) {
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " " + student.getCountry());
        return "student-confirmation";
    }
}
