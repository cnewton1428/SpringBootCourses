package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {

    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    CoursesRepository coursesRepository;

    @RequestMapping("/")
    public String index(Model model) {
        Students students = new Students();
        students.setFirstname("Michaela");
        students.setLastname("Maxwell");

        Courses courses = new Courses();
        courses.setTitle("Biology");
        courses.setInstructor("Dr.Ross");
        courses.setCredits(4);
        courses.setDescription("Learn everything about living things...");

        Set<Courses> courses1 = new HashSet<Courses>();
        courses1.add(courses);

        students.setCourses(courses1);

        studentsRepository.save(students);

        model.addAttribute("student", studentsRepository.findAll());
        return "index";
    }
}
