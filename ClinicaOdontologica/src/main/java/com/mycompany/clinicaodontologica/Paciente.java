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
public class Paciente {
    private String nombre;
    private int documento;
    private int telefono;
    private ArrayList<Tratamiento> tratamientos;

    public Paciente(String nombre, int documento, int telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public void agregarTratamientos(Tratamiento tratamiento){
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }
    
    
}
