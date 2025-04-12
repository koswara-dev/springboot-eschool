package com.juaracoding.eschool.service;

import com.juaracoding.eschool.exception.ResourceNotFoundException;
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

    public Classroom getClassroomById(Long id){
        return classroomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Classroom not found with id: "+id));
    }

    public void deleteClassroom(Long id) {
        Classroom classroom = classroomRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Classroom not found with id: "+id));

        var students = studentRepository.findByClassroomId(id);
        students.forEach(student -> student.setClassroom(null));
        studentRepository.saveAll(students);

        classroomRepository.delete(classroom);
    }

}
