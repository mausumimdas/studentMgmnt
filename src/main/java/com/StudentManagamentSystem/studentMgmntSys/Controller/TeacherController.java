package com.StudentManagamentSystem.studentMgmntSys.Controller;

import com.StudentManagamentSystem.studentMgmntSys.Models.School;
import com.StudentManagamentSystem.studentMgmntSys.Models.Teacher;
import com.StudentManagamentSystem.studentMgmntSys.Service.SchoolService;
import com.StudentManagamentSystem.studentMgmntSys.Service.TeacherService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@Transactional
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/hello")
    public String hello(){
        return"hello";
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.OK)
    public Teacher saveTeacherDetails(@RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }
}
