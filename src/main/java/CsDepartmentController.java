package com.example.springassignment1;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CsDepartmentController {

    // Test endpoint
    @GetMapping("/test")
    public String test() {
        return "API test is working!";
    }

    // Full department courses
    @GetMapping("/department")
    public DepartmentCourses getDepartmentCourses() {
        return new DepartmentCourses(
                getFoundationCourses(),
                getUndergraduateCourses(),
                getHonoursCourses()
        );
    }

    // Honours courses only
    @GetMapping("/honours")
    public List<Courses> getHonoursOnly() {
        return getHonoursCourses();
    }

    private List<Courses> getFoundationCourses() {
        return Arrays.asList(
                new Courses("MAT101", "Introduction to Programming", "Foundation"),
                new Courses("MAT102", "Computer Systems Fundamentals", "Foundation")
        );
    }

    private List<Courses> getUndergraduateCourses() {
        return Arrays.asList(
                new Courses("MAT201", "Data Structures and Algorithms", "Undergraduate"),
                new Courses("MAT202", "Database Systems", "Undergraduate"),
                new Courses("MAT203", "Operating Systems", "Undergraduate"),
                new Courses("MAT204", "Software Engineering", "Undergraduate"),
                new Courses("MAT205", "Computer Networks", "Undergraduate")
        );
    }

    private List<Courses> getHonoursCourses() {
        return Arrays.asList(
                new Courses("MAT369", "Advanced Algorithms", "Honours"),
                new Courses("MAT370", "Artificial Intelligence", "Honours"),
                new Courses("MAT371", "Machine Learning", "Honours"),
                new Courses("MAT372", "Cloud Computing", "Honours")
        );
    }
}