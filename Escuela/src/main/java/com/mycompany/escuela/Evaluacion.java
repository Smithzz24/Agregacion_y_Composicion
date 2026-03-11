/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;
import java.time.LocalDate;

/**
 Un colegio administra estudiantes, docentes y cursos.
Cada docente puede dictar varios cursos durante el año. 
* Un curso tiene nombre y código.
Dentro de cada curso se registran evaluaciones (parcial, final, trabajos), cada una con fecha y porcentaje. 
* Si un curso se elimina, sus evaluaciones también deben eliminarse.
Los estudiantes pueden estar matriculados en varios cursos.

 * @author Smith
 */
public class Evaluacion {
    private String tipo;
    private String tema;
    private LocalDate fecha;
    private int porcentaje;

    public Evaluacion(String tipo, String tema, LocalDate fecha, int porcentaje) {
        this.tipo = tipo;
        this.tema = tema;
        this.fecha = fecha;
        this.porcentaje = porcentaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
