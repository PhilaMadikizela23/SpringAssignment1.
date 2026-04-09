package com.example.springassignment1;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/courses")
public class MatDepartmentController {

    @Autowired
    private CourseService service;


    @GetMapping("/test")
    public String test() {
        return "API is working!";
    }


    @GetMapping("/department")
    public DepartmentCourses getDepartmentCourses() {
        return new DepartmentCourses(
                service.getByLevel("Foundation"),
                service.getByLevel("Undergraduate"),
                service.getByLevel("Honours")
        );
    }

    // ✅ PART A: Honours only
    @GetMapping("/honours")
    public List<Courses> getHonours() {
        return service.getByLevel("Honours");
    }

    // =========================
    // ✅ PART B: CRUD
    // =========================

    // CREATE
    @PostMapping
    public Courses createCourse(@Valid @RequestBody Courses course) {
        return service.addCourse(course);
    }

    // READ ALL
    @GetMapping
    public List<Courses> getAllCourses() {
        return service.getAllCourses();
    }

    // READ ONE
    @GetMapping("/{code}")
    public Courses getCourse(@PathVariable String code) {
        return service.getCourseByCode(code);
    }

    // UPDATE
    @PutMapping("/{code}")
    public Courses updateCourse(@PathVariable String code,
                                @Valid @RequestBody Courses course) {
        return service.updateCourse(code, course);
    }


    @DeleteMapping("/{code}")
    public String deleteCourse(@PathVariable String code) {
        boolean deleted = service.deleteCourse(code);
        return deleted ? "Course deleted" : "Course not found";
    }
}