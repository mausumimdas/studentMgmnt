package com.StudentManagamentSystem.studentMgmntSys.Service;

import com.StudentManagamentSystem.studentMgmntSys.Models.School;
import com.StudentManagamentSystem.studentMgmntSys.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School saveSchoolDetails(School school){

        return schoolRepository.save(school);
    }
}
