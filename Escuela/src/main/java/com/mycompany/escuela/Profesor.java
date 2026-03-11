/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuela;
import java.util.ArrayList;

/**
 Un colegio administra estudiantes, docentes y cursos.
Cada docente puede dictar varios cursos durante el año. 
* Un curso tiene nombre y código.
Dentro de cada curso se registran evaluaciones (parcial, final, trabajos), cada una con fecha y porcentaje. 
* Si un curso se elimina, sus evaluaciones también deben eliminarse.
Los estudiantes pueden estar matriculados en varios cursos.
 * @author Smith
 */
public class Profesor {
    private String nombre;
    private int telefono;
    private String email;
    private ArrayList<Curso> cursos;

    public Profesor(String nombre, int telefono, String email, ArrayList cursos) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cursos = cursos;
    }

    public void agregarCurso (Curso curso){
        this.cursos.add(curso);
    }
    
    public void eliminarCurso (Curso curso){
        this.cursos.remove(curso);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList cursos) {
        this.cursos = cursos;
    }
    
    
}
