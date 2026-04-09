package com.example.springassignment1;

public class Courses {

    private String code;
    private String name;
    private String level;

    public Courses(String code, String name, String level) {
        this.code = code;
        this.name = name;
        this.level = level;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }
}