package com.pgbadmin.education.models.home;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Slidebar {
    @Id
    @GeneratedValue
    private Long slidebarId;

    @OneToMany(mappedBy = "slidebar")
    private List<SlideBarImages> images;


}
