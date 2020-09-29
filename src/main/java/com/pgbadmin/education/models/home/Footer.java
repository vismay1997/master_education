package com.pgbadmin.education.models.home;

import javax.persistence.*;

@Entity
public class Footer {
    @Id
    @GeneratedValue
    private Long footerId;

    private String text;
    private String description;

    @OneToOne
    @JoinColumn(name = "home_section_id")
    private HomeSection homeSection;
}
