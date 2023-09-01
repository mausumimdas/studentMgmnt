package com.StudentManagamentSystem.studentMgmntSys.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {
    private long studentId;
    private String studentName;
    private String teacherName;
    private String schoolName;
}
