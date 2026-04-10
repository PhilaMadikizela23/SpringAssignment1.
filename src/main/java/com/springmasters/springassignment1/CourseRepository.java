package com.example.springassignment1;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CourseRepository extends JpaRepository<Courses, String> {
    List<Courses> findByLevel(String level);
}