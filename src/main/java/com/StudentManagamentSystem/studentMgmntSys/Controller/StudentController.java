package com.StudentManagamentSystem.studentMgmntSys.Controller;

import com.StudentManagamentSystem.studentMgmntSys.Models.Student;
import com.StudentManagamentSystem.studentMgmntSys.Repository.StudentRepository;
import com.StudentManagamentSystem.studentMgmntSys.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student addStudent(@RequestBody Student student){
        System.out.println("Inside controller");
        System.out.println(student.toString());
         return studentService.addStudent(student);

    }
}
