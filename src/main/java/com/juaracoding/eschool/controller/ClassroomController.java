package com.juaracoding.eschool.controller;

import com.juaracoding.eschool.service.ClassroomService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    private final ClassroomService categoryService;

    public ClassroomController(ClassroomService categoryService) {
        this.categoryService = categoryService;
    }

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable Long id) {
        categoryService.deleteClassroom(id);
    }
}
