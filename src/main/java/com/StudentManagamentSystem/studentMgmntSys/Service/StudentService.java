package com.StudentManagamentSystem.studentMgmntSys.Service;

import com.StudentManagamentSystem.studentMgmntSys.DTO.StudentDetails;
import com.StudentManagamentSystem.studentMgmntSys.Models.School;
import com.StudentManagamentSystem.studentMgmntSys.Models.Student;
import com.StudentManagamentSystem.studentMgmntSys.Models.Teacher;
import com.StudentManagamentSystem.studentMgmntSys.Repository.SchoolRepository;
import com.StudentManagamentSystem.studentMgmntSys.Repository.StudentRepository;
import com.StudentManagamentSystem.studentMgmntSys.Repository.TeacherRepository;
import org.aspectj.weaver.UnresolvedType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    public Student addStudent(Student student) {
        // set school name if it exists and teacher name if she exists
        System.out.println("Inside service");
        System.out.println("student is " + student.toString());
        System.out.println(student.getSchool().getSchoolName());

        School school = schoolRepository.findByschoolName(student.getSchool().getSchoolName());
        if(school!=null){
            student.setSchool(school);
        }

        Teacher teacher=teacherRepository.findByteacherName(student.getTeacher().getTeacherName());
        if(teacher!=null){
            student.setTeacher(teacher);
        }
       // System.out.println(school.toString());

        //School school = schoolRepository.findByschoolName(student.getSchool().getSchoolName());
        //System.out.println("school is " + school.toString());
//        System.out.println("teacher" + student.getTeacher().getTeacherName());
//        Teacher teacher=teacherRepository.findByteacherName(student.getTeacher().getTeacherName());

        //System.out.println(teacher.toString());

//        List<Student> studentList = school.getStudents();
//        studentList.add(student);
//        school.setStudents(studentList);
//        student.setSchool(school);
//
//        List<Student> studentsListTeacher = teacher.getStudents();
//        studentsListTeacher.add(student);
//        teacher.setStudents(studentsListTeacher);
//        student.setTeacher(teacher);

        return studentRepository.save(student);
    }

//    public List<StudentDetails> getStudentDetails(){
//        return studentRepository.getStudentDetailsFromDb();
//    }
}
