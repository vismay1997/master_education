package com.pgbadmin.education.models.home;

import javax.persistence.*;

@Entity
public class ExteralLinks {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String externalLinks;
    private byte[] logo;

    @ManyToOne
    @JoinColumn(name = "contactus_id")
    private ContactUsSection contactInfo;

}
