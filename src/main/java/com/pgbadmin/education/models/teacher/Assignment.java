package com.pgbadmin.education.models.teacher;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

@Entity
public class Assignment {
    @Id
    @GeneratedValue
    private Long assignmentId;
    private String assignmentName;
    private String assignmentDescription;

    @Temporal(TemporalType.TIMESTAMP)
    private Date submissionDueDate;

    @OneToMany(mappedBy = "assignment")
    private List<AssignmentFiles> files;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
