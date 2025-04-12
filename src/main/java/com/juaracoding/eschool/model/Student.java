package com.juaracoding.eschool.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "classroom_id", foreignKey = @ForeignKey(name = "fk_students_classroom_id"), nullable = true)
    private Classroom classroom;

}
