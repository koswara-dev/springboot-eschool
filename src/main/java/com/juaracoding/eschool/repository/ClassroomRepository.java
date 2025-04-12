package com.juaracoding.eschool.repository;

import com.juaracoding.eschool.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
