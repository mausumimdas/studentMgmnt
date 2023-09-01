package com.StudentManagamentSystem.studentMgmntSys.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String addressLine;
    @OneToOne(mappedBy = "address")
    private Student student;
}
