package com.course4.courseserv.repository;

import com.course4.courseserv.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
