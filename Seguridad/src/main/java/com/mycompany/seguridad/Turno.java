/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguridad;
import java.time.LocalDate;
/**
 Una empresa de seguridad contrata guardias y presta servicios a distintas compañías.
Cada servicio tiene fecha de inicio, duración y empresa contratante. 
* Los guardias pueden ser asignados a distintos servicios.
Para cada servicio se registran turnos diarios con hora de inicio y fin. 
* Si el servicio termina y se elimina del sistema, los turnos asociados también deben eliminarse.
 * @author Smith
 */
class Turno {
    private LocalDate fecha;
    private int horaInicio;
    private int horaFin;

    public Turno(LocalDate fecha, int horaInicio, int horaFin) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
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
    
    
}
