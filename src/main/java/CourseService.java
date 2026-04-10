package com.example.springassignment1;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    // Load initial data exactly once when the app starts
    @PostConstruct
    public void loadInitialData() {
        if (repository.count() == 0) {
            // ===== Foundation Courses (exactly 2) =====
            repository.save(new Courses("MAT101", "Calculus I", "Foundation"));
            repository.save(new Courses("MAT102", "Linear Algebra I", "Foundation"));

            // ===== Undergraduate Courses (exactly 5) =====
            repository.save(new Courses("MAT201", "Calculus II", "Undergraduate"));
            repository.save(new Courses("MAT202", "Linear Algebra II", "Undergraduate"));
            repository.save(new Courses("MAT203", "Probability and Statistics", "Undergraduate"));
            repository.save(new Courses("MAT204", "Numerical Methods", "Undergraduate"));
            repository.save(new Courses("MAT205", "Abstract Algebra", "Undergraduate"));

            // ===== Honours Courses (exactly 4) =====
            repository.save(new Courses("MAT301", "Real Analysis", "Honours"));
            repository.save(new Courses("MAT302", "Complex Analysis", "Honours"));
            repository.save(new Courses("MAT303", "Topology", "Honours"));
            repository.save(new Courses("MAT304", "Differential Geometry", "Honours"));
        }
    }

    // ===== FULL CRUD (now connected to real database) =====
    public Courses addCourse(Courses course) {
        return repository.save(course);
    }

    public List<Courses> getAllCourses() {
        return repository.findAll();
    }

    public Courses getCourseByCode(String code) {
        return repository.findById(code).orElse(null);
    }

    public Courses updateCourse(String code, Courses updated) {
        return repository.findById(code).map(course -> {
            course.setName(updated.getName());
            course.setLevel(updated.getLevel());
            return repository.save(course);
        }).orElse(null);
    }

    public boolean deleteCourse(String code) {
        if (repository.existsById(code)) {
            repository.deleteById(code);
            return true;
        }
        return false;
    }

    public List<Courses> getByLevel(String level) {
        return repository.findByLevel(level);
    }
}