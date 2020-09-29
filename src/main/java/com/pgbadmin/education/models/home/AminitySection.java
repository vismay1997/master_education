package com.pgbadmin.education.models.home;

import javax.persistence.*;
import java.util.List;

@Entity
public class AminitySection {

    @Id
    @GeneratedValue
    private Long animitySectionId;

    private String title;
    private String description;

    @OneToMany(mappedBy = "aminitySection")
    private List<AmanityFiles> files;

}

@Entity
class AmanityFiles {

    @Id
    @GeneratedValue
    private Long fileId;
    private String fileName;
    private byte[] file;

    @ManyToOne
    @JoinColumn(name = "aminity_id")
    private AminitySection aminitySection;
}