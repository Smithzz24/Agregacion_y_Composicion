/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaeventos;

/**
 *
 * @author Smith
 */
public class ActividadEspecifica {
    private String nombre;
    private int horaInicio;
    private float duracion;
    private String responsable;

    public ActividadEspecifica(String nombre, int horaInicio, float duracion, String responsable) {
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.responsable = responsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    
    
}
