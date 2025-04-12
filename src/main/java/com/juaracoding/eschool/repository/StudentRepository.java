package com.juaracoding.eschool.repository;

import com.juaracoding.eschool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByClassroomId(Long classroomId);
}
