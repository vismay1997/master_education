package com.pgbadmin.education.models.home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class AboutUsSection {

    @Id
    @GeneratedValue
    private Long aboutUsId;
    private String Title;
    private String description;
    private byte[] image;


}
