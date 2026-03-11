/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaviajes;
import java.time.LocalDate;
/**
Una agencia organiza viajes para sus clientes.
Cada viaje tiene destino, fecha y costo. 
* Un cliente puede reservar varios viajes.
Dentro de cada viaje se incluyen reservas de hotel y actividades programadas. 
* Si el viaje se cancela y se elimina del sistema, las reservas y actividades asociadas también desaparecen.

 * @author Smith
 */
public class ActividadProgramada {
    private String nombre;
    private LocalDate fecha;
    private int horaInicio;
    private int horaFin;
    private String descripcion;

    public ActividadProgramada(String nombre, LocalDate fecha, int horaInicio, int horaFin, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
