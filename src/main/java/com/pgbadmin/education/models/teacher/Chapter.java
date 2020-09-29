package com.pgbadmin.education.models.teacher;

import javax.persistence.*;

@Entity
class Chapter {

    @Id
    @GeneratedValue
    private Long srNo;
    private String chapterTitle;
    private String chapterDescription;
    private Float duration;

    @Enumerated(EnumType.STRING)
    private durationType durationType;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterDescription() {
        return chapterDescription;
    }

    public void setChapterDescription(String chapterDescription) {
        this.chapterDescription = chapterDescription;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public com.pgbadmin.education.models.teacher.durationType getDurationType() {
        return durationType;
    }

    public void setDurationType(com.pgbadmin.education.models.teacher.durationType durationType) {
        this.durationType = durationType;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

enum durationType {
    DAYS, WEEKS, YEARS
}