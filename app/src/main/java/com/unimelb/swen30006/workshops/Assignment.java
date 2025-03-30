package com.unimelb.swen30006.workshops;

import java.util.Date;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;

    public Assignment(String _description, Date _dueDate, int _maxAttempts, String _name) {
        description = _description;
        dueDate = _dueDate;
        maxAttempts = _maxAttempts;
        name = _name;
    }

    public Submission[] invalidSubmissions() {

    }

    public Submission[] validSubmissions() {

    }
}
