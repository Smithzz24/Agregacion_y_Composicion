/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguridad;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 Una empresa de seguridad contrata guardias y presta servicios a distintas compañías.
Cada servicio tiene fecha de inicio, duración y empresa contratante. 
* Los guardias pueden ser asignados a distintos servicios.
Para cada servicio se registran turnos diarios con hora de inicio y fin. 
* Si el servicio termina y se elimina del sistema, los turnos asociados también deben eliminarse.
 * @author Smith
 */
class Servicio {
    private LocalDate fechaInicio;
    private int duracion;
    private ArrayList<Turno> turnos;
    private Guardia guardia;

    public Servicio(LocalDate fechaInicio, int duracion, ArrayList<Turno> turnos, Guardia guardia) {
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.turnos = turnos;
        this.guardia = guardia;
    }
    
    public void agregarTurnos (LocalDate fecha, int horaInicio, int horaFin){
        Turno turno = new Turno(fecha, horaInicio, horaFin);
        this.turnos.add(turno);
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList turnos) {
        this.turnos = turnos;
    }

    public Guardia getGuardia() {
        return guardia;
    }

    public void setGuardia(Guardia guardia) {
        this.guardia = guardia;
    }
    
    
}
