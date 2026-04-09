package com.example.springassignment1;

import java.util.List;

public class DepartmentCourses {

    private List<Courses> foundationCourses;
    private List<Courses> undergraduateCourses;
    private List<Courses> honoursCourses;

    public DepartmentCourses(List<Courses> foundationCourses,
                             List<Courses> undergraduateCourses,
                             List<Courses> honoursCourses) {
        this.foundationCourses = foundationCourses;
        this.undergraduateCourses = undergraduateCourses;
        this.honoursCourses = honoursCourses;
    }

    public List<Courses> getFoundationCourses() { return foundationCourses; }
    public List<Courses> getUndergraduateCourses() { return undergraduateCourses; }
    public List<Courses> getHonoursCourses() { return honoursCourses; }
}