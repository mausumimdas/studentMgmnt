package com.StudentManagamentSystem.studentMgmntSys.Repository;

import com.StudentManagamentSystem.studentMgmntSys.DTO.StudentDetails;
import com.StudentManagamentSystem.studentMgmntSys.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
//    @Query("select from Student s JOIN School ")
    //List<StudentDetails> getStudentDetailsFromDb();
}
