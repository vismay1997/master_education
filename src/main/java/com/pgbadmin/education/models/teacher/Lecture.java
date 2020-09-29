package com.pgbadmin.education.models.teacher;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Lecture {

    @Id
    @GeneratedValue
    private Long lectureId;

    private String lectureName;

    private String lectureDescription;

    private Date lectureStart;

    private String lectureEnd;

    @ManyToOne
    @JoinColumn(name = "course")
    private Course course;

}
