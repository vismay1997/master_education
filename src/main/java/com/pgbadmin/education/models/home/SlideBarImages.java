package com.pgbadmin.education.models.home;

import javax.persistence.*;

@Entity
public class SlideBarImages {
    @Id
    @GeneratedValue
    private Long SlideBarImageId;

    private byte[] images;

    @ManyToOne
    @JoinColumn(name = "slidebar_id")
    private Slidebar slidebar;
}
