package com.StudentManagamentSystem.studentMgmntSys.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="school")
@Builder
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long schoolId;
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID school_uuid;
    private String schoolName;

    @OneToMany(mappedBy = "school")
    @JsonManagedReference
    private List<Teacher> teachers;
    @OneToMany(mappedBy = "school")
    private List<Student> students;

    @PrePersist
    public void prePersistToUpdateUUid(){
        System.out.println("prepersist called");
        if(this.school_uuid == null){
            this.setSchool_uuid(UUID.randomUUID());
        }
    }
}
