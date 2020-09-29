package com.pgbadmin.education.models.home;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Long notificationId;

    private String title;

    private String description;

    private Byte[] contentDocument;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "home_section_id")
    private HomeSection homeSection;

}
