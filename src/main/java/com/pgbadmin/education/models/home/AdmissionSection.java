package com.pgbadmin.education.models.home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AdmissionSection {

    @Id
    @GeneratedValue
    private Long admissionSectionId;

    @OneToMany(mappedBy = "admissionSection")
    private List<AdmissionForm> admissionForms;

}
