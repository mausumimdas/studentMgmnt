package com.StudentManagamentSystem.studentMgmntSys.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_id_seq")
    @SequenceGenerator(name = "teacher_id_seq", sequenceName = "teacher_id_seq", allocationSize = 1, initialValue = 1)
    private long teacherId;
    private String teacherName;
    private String course;
    @ManyToOne
    @JoinColumn(name="school_uuid", referencedColumnName = "school_uuid")
    @JsonBackReference
    private School school;
    @OneToMany(mappedBy = "teacher")
    private List<Student> students;

}