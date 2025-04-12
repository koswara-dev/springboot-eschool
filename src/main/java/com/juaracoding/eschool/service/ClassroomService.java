package com.juaracoding.eschool.service;

import com.juaracoding.eschool.model.Classroom;
import com.juaracoding.eschool.repository.ClassroomRepository;
import com.juaracoding.eschool.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private StudentRepository studentRepository;

    public void deleteClassroom(Long categoryId) {
        Classroom classroom = classroomRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Classroom not found"));

        var students = studentRepository.findByClassroomId(categoryId);
        students.forEach(student -> student.setClassroom(null));
        studentRepository.saveAll(students);

        classroomRepository.delete(classroom);
    }

}
