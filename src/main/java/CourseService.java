package com.example.springassignment1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    private final List<Courses> courses = new ArrayList<>();

    public CourseService() {
        // ===== Foundation Courses =====
        courses.add(new Courses("MAT101", "Calculus I", "Foundation"));
        courses.add(new Courses("MAT102", "Linear Algebra I", "Foundation"));
        courses.add(new Courses("MAT103", "Discrete Mathematics", "Foundation"));
        courses.add(new Courses("MAT104", "Introduction to Mathematical Proofs", "Foundation"));

        // ===== Undergraduate Courses =====
        courses.add(new Courses("MAT201", "Calculus II", "Undergraduate"));
        courses.add(new Courses("MAT202", "Linear Algebra II", "Undergraduate"));
        courses.add(new Courses("MAT203", "Probability and Statistics", "Undergraduate"));
        courses.add(new Courses("MAT204", "Numerical Methods", "Undergraduate"));
        courses.add(new Courses("MAT205", "Abstract Algebra", "Undergraduate"));

        // ===== Honours Courses =====
        courses.add(new Courses("MAT301", "Real Analysis", "Honours"));
        courses.add(new Courses("MAT302", "Complex Analysis", "Honours"));
        courses.add(new Courses("MAT303", "Topology", "Honours"));
        courses.add(new Courses("MAT304", "Differential Geometry", "Honours"));
    }

    // ===== CRUD Operations =====
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