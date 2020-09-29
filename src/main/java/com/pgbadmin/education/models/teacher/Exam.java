package com.pgbadmin.education.models.teacher;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Exam {

    @Id
    @GeneratedValue
    private Long examId;

    private String title;

    private String description;

    private Float marks;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}

