/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;
import java.util.ArrayList;
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
public class Curso {
    private String nombre;
    private String codigo;
    private ArrayList<Evaluacion> evaluaciones;

    public Curso(String nombre, String codigo, ArrayList<Evaluacion> evaluaciones) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.evaluaciones = evaluaciones;
    }

    public void agregarEvaluaciones(String tipo, String tema, LocalDate fecha, int porcentaje){
        Evaluacion evaluacion = new Evaluacion (tipo, tema, fecha, porcentaje);
        this.evaluaciones.add(evaluacion);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
    
    
}
