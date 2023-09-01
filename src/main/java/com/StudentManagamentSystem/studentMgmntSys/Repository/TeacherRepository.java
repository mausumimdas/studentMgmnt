package com.StudentManagamentSystem.studentMgmntSys.Repository;

import com.StudentManagamentSystem.studentMgmntSys.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Teacher findByteacherName(String teacherName);
}
