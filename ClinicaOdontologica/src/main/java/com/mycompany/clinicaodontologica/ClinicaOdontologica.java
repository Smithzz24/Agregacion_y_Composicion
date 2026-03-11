/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class ClinicaOdontologica {
    private String nombre;
    private String dirección;
    private ArrayList<Odontologo> odontologos; //Asociación con Odontologo
    private ArrayList<Paciente> pacientes; //Asociación con Odontologo
    
    public ClinicaOdontologica(String nombre, String dirección) {
        this.nombre = nombre;
        this.dirección = dirección;
    }
    //Agregación con Odontologo
    public void agregarOdontologos (Odontologo odontologo){
        this.odontologos.add(odontologo);
    }
    public void eliminarOdontologos (Odontologo odontologo){
        this.odontologos.remove(odontologo);
    }
        
    public void agregarPacientes (Paciente paciente){
        this.pacientes.add(paciente);
    }
    public void eliminarPacientes (Paciente paciente){
        this.pacientes.remove(paciente);
    }
    
    //------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public ArrayList<Odontologo> getOdontologos() {
        return odontologos;
    }

    public void setOdontologos(ArrayList<Odontologo> odontologos) {
        this.odontologos = odontologos;
    }
    
}
