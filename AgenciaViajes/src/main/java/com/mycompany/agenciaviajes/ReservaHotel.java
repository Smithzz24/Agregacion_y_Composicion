/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaviajes;
import java.time.LocalDate;
import java.util.ArrayList;
/**
Una agencia organiza viajes para sus clientes.
Cada viaje tiene destino, fecha y costo. 
* Un cliente puede reservar varios viajes.
Dentro de cada viaje se incluyen reservas de hotel y actividades programadas. 
* Si el viaje se cancela y se elimina del sistema, las reservas y actividades asociadas también desaparecen.
 * @author Smith
 */
public class ReservaHotel {
    private String nombre;
    private String direccion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<ActividadProgramada> actividadesProgramadas;

    public ReservaHotel(String nombre, String direccion, LocalDate fechaInicio, LocalDate fechaFin, ArrayList<ActividadProgramada> actividadesProgramadas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void agregarActividades(String nombre, LocalDate fecha, int horaInicio, int horaFin, String descripcion){
        ActividadProgramada actividadProgramada = new ActividadProgramada(nombre, fecha, horaInicio, horaFin, descripcion);
        this.actividadesProgramadas.add(actividadProgramada);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<ActividadProgramada> getActividadesProgramadas() {
        return actividadesProgramadas;
    }

    public void setActividadesProgramadas(ArrayList<ActividadProgramada> actividadesProgramadas) {
        this.actividadesProgramadas = actividadesProgramadas;
    }
    
    
}
