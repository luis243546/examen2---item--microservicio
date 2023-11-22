package com.edad.edad.entity;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Alumno {
    
    private Long codigo;
    private String nombre;
    private LocalDate fecha_nacimiento;
    private Double nota1, nota2, nota3;
}
