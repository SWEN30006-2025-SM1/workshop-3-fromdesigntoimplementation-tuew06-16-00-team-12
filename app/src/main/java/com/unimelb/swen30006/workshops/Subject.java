package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Subject {
    private String name;
    private String subjectCode;

    public Subject(String _name, String _subjectCode) {
        name = _name;
        subjectCode = _subjectCode;
    }

    public void createAssignment(String description, Date dueDate, int maxAttempts, String name) {
        Assignment assignment = new Assignment(description, dueDate, maxAttempts, name);
    }

    public void deleteAssignment() {

    }
}
