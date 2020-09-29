package com.pgbadmin.education.models.home;

import com.pgbadmin.education.models.teacher.Department;

import javax.persistence.*;

@Entity
public class AdmissionForm {

    @Id
    @GeneratedValue
    private Long admissionFormID;

    @ManyToOne
    private Department department;

    private String studentName;

    private String address;

    private String mobileNo;

    private String telephoneNo;

    private String city;

    private int pinCode;

    private int country;

    private int state;

    private String email;

    private String gender;

    private byte[] resume;

    @ManyToOne
    @JoinColumn(name = "admission_section_id")
    private AdmissionSection admissionSection;
}
