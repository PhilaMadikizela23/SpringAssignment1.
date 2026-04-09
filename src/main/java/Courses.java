package com.example.springassignment1;

import jakarta.validation.constraints.NotBlank;

public class Courses {

    @NotBlank(message = "Course code is required")
    private String code;

    @NotBlank(message = "Course name is required")
    private String name;

    @NotBlank(message = "Course level is required")
    private String level;

    public Courses() {}

    public Courses(String code, String name, String level) {
        this.code = code;
        this.name = name;
        this.level = level;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public String getLevel() { return level; }

    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }
    public void setLevel(String level) { this.level = level; }
}