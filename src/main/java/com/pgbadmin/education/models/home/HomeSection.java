package com.pgbadmin.education.models.home;


import javax.persistence.*;
import java.util.List;

@Entity
public class HomeSection {
    @Id
    @GeneratedValue
    private Long homeSectionId;

    @OneToMany(mappedBy = "homeSection")
    private List<Notification> notifications;

    @OneToOne(mappedBy = "homeSection")
    private Footer footer;


}
