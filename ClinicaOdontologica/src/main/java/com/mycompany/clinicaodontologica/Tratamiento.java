        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodontologica;
import java.time.LocalDate;
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
public class Tratamiento {
    private LocalDate fechaInicio;
    private String diagnostico;
    private Float costoEstimado;
    private ArrayList<Sesion> sesiones;

    public Tratamiento(LocalDate fechaInicio, String diagnostico, Float costoEstimado) {
        this.fechaInicio = fechaInicio;
        this.diagnostico = diagnostico;
        this.costoEstimado = costoEstimado;
    }

    public void agregarSesiones (LocalDate fecha, String procedimientoRealizado){
        Sesion sesion = new Sesion(fecha, procedimientoRealizado);
        this.sesiones.add(sesion);
    }
    public void eliminarSesiones (Sesion sesion){
        this.sesiones.remove(sesion);
    }
            
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Float getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(Float costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(ArrayList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
    
    
}
