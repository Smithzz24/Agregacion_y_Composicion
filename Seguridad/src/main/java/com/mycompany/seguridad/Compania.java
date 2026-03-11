/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguridad;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 Una empresa de seguridad contrata guardias y presta servicios a distintas compañías.
Cada servicio tiene fecha de inicio, duración y empresa contratante. 
* Los guardias pueden ser asignados a distintos servicios.
Para cada servicio se registran turnos diarios con hora de inicio y fin. 
* Si el servicio termina y se elimina del sistema, los turnos asociados también deben eliminarse.

 * @author Smith
 */
public class Compania {
    
    private String nombre;
    private String direccion;
    private ArrayList<Servicio> servicios;

    public Compania(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarServicio (LocalDate fechaInicio, int duracion, ArrayList turnos, Guardia guardia){
        Servicio servicio = new Servicio (fechaInicio, duracion, turnos, guardia);
        this.servicios.add(servicio);
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

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    
}
