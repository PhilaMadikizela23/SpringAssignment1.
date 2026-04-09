package com.example.springassignment1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Courses> courses = new ArrayList<>();

    public CourseService() {

        courses.add(new Courses("MAT101", "Introduction to Programming", "Foundation"));
        courses.add(new Courses("MAT102", "Computer Systems Fundamentals", "Foundation"));


        courses.add(new Courses("MAT201", "Data Structures and Algorithms", "Undergraduate"));
        courses.add(new Courses("MAT202", "Database Systems", "Undergraduate"));
        courses.add(new Courses("MAT203", "Operating Systems", "Undergraduate"));
        courses.add(new Courses("MAT204", "Software Engineering", "Undergraduate"));
        courses.add(new Courses("MAT205", "Computer Networks", "Undergraduate"));


        courses.add(new Courses("MAT369", "Advanced Algorithms", "Honours"));
        courses.add(new Courses("MAT370", "Artificial Intelligence", "Honours"));
        courses.add(new Courses("MAT371", "Machine Learning", "Honours"));
        courses.add(new Courses("MAT372", "Cloud Computing", "Honours"));
    }


    public Courses addCourse(Courses course) {
        courses.add(course);
        return course;
    }


    public List<Courses> getAllCourses() {
        return courses;
    }


    public Courses getCourseByCode(String code) {
        return courses.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }


    public Courses updateCourse(String code, Courses updated) {
        for (Courses c : courses) {
            if (c.getCode().equalsIgnoreCase(code)) {
                c.setName(updated.getName());
                c.setLevel(updated.getLevel());
                return c;
            }
        }
        return null;
    }


    public boolean deleteCourse(String code) {
        return courses.removeIf(c -> c.getCode().equalsIgnoreCase(code));
    }


    public List<Courses> getByLevel(String level) {
        return courses.stream()
                .filter(c -> c.getLevel().equalsIgnoreCase(level))
                .toList();
    }
}