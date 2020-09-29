package com.pgbadmin.education.models.home;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContactUsSection {
    @Id
    @GeneratedValue
    private Long contactInfoId;
    private String title;
    private String address;
    private String mobileNo;
    private String telephoneNo;
    private String emailId;

    @OneToMany(mappedBy = "contactInfo")
    private List<ExteralLinks> externalLinks;


}
