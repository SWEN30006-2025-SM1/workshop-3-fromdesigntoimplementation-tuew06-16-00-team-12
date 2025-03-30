package com.unimelb.swen30006.workshops;

public class Staff extends Person {
    private String[] roles;
    private String staffID;

    public Staff(String[] _roles, String _staffID) {
        roles = _roles;
        staffID = _staffID;
    }
}
