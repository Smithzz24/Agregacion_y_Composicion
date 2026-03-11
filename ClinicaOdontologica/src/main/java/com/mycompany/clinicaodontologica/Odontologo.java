/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodontologica;
import java.util.ArrayList;

/**
 *Una clínica odontológica quiere organizar mejor su información.
Registra los datos de los odontólogos que trabajan allí, incluyendo su nombre, especialidad y número de tarjeta profesional. 
También guarda información de los pacientes, como nombre, documento y teléfono.
Cada paciente puede tener varios tratamientos. Cada tratamiento tiene fecha de inicio, diagnóstico y costo estimado. 
Además, por cada tratamiento se registran sesiones individuales con fecha y procedimiento realizado.
Si un tratamiento se elimina del sistema, también deben desaparecer sus sesiones asociadas. 
Los odontólogos pueden atender pacientes en otras clínicas.
 * @author Smith
 */
public class Odontologo {
    private String nombre;
    private String especialidad;
    private int numeroTarjetaProfesional;
    private ArrayList<Tratamiento> tratamientos;

    public Odontologo(String nombre, String especialidad, int numeroTarjetaProfesional) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroTarjetaProfesional = numeroTarjetaProfesional;
    }
    
    //Agregación
    public void agregarTratamientos (Tratamiento tratamiento){
        this.tratamientos.add(tratamiento);
    }
    public void eliminarTratamientos(Tratamiento tratamiento){
        this.tratamientos.remove(tratamiento);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroTarjetaProfesional() {
        return numeroTarjetaProfesional;
    }

    public void setNumeroTarjetaProfesional(int numeroTarjetaProfesional) {
        this.numeroTarjetaProfesional = numeroTarjetaProfesional;
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
    
    
    
    
}
