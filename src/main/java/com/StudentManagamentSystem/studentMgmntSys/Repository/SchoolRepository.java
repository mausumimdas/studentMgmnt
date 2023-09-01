package com.StudentManagamentSystem.studentMgmntSys.Repository;

import com.StudentManagamentSystem.studentMgmntSys.Models.School;
import com.StudentManagamentSystem.studentMgmntSys.Service.SchoolService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Long> {
    School findByschoolName(String schoolName);
}
