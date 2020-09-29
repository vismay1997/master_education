package com.pgbadmin.education.models.teacher;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class AssignmentFiles {
    @Id
    @GeneratedValue
    private UUID fileId;
    private String fileName;
    private byte[] file;

    @ManyToOne
    @JoinColumn(name = "assignment_id")
    private Assignment assignment;

    public UUID getFileId() {
        return fileId;
    }

    public void setFileId(UUID fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }
}
