package com.edad.edad.entity;

import java.time.LocalDate;
import java.time.Period;

public class Item {
    
    private Alumno alumno;
    
    public Item(){}

    public Item(Alumno alumno) {
        this.alumno = alumno;
        
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    public int getEdad(){
        return Period.between(alumno.getFecha_nacimiento(), LocalDate.now()).getYears();
    }

    public Double getPromedio(){
        return (alumno.getNota1().doubleValue()+alumno.getNota2().doubleValue()+alumno.getNota3().doubleValue())/3;
    }

    public String getCondicionPro() {
		Double promedio = getPromedio();
	
		if (promedio != null && promedio > 13) {
			return "APROBADO";
		} else {
			return "DESAPROBADO";
		}
	}
}
