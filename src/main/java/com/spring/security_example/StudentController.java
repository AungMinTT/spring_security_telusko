package com.spring.security_example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> studentList = new ArrayList<>(List.of(
            new Student(1L, "Aung", 80),
            new Student(2l, "Min", 90)
            ));

    @GetMapping("api/students")
    public List<Student> getStudents(){
        return studentList;
    }

    @PostMapping("api/students")
    public List<Student> createStudent(@RequestBody Student student){
        studentList.add(student);
        return studentList;
    }

    @GetMapping("api/csrf")
    public CsrfToken getCSRF(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
