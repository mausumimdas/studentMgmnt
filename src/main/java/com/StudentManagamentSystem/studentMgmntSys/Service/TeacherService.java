package com.StudentManagamentSystem.studentMgmntSys.Service;

import com.StudentManagamentSystem.studentMgmntSys.Models.School;
import com.StudentManagamentSystem.studentMgmntSys.Models.Teacher;
import com.StudentManagamentSystem.studentMgmntSys.Repository.SchoolRepository;
import com.StudentManagamentSystem.studentMgmntSys.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    public Teacher saveTeacher(Teacher teacher){
        School school = schoolRepository.findByschoolName(teacher.getSchool().getSchoolName());
        teacher.setSchool(school);
        school.getTeachers().add(teacher);
        return teacherRepository.save(teacher);
    }
}
