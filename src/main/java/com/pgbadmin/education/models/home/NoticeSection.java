package com.pgbadmin.education.models.home;

import javax.persistence.*;

@Entity
public class NoticeSection {
    @Id
    @GeneratedValue
    private Long noticeId;
    private String title;
    private String description;
    private byte[] supportingDocument;
    private byte[] image;
}
