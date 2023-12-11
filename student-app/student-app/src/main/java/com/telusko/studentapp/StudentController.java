package com.telusko.studentapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return List.of(
                new Student(1, "aaa", 23),
                new Student(2, "bbb", 22),
                new Student(3, "ccc", 18)
        );
    }
}
