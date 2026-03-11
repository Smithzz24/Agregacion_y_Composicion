/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstruccion;
import java.util.ArrayList;
/**
 *
 * @author Smith
 */
public class Etapa {
    private String nombre;
    private ArrayList<Actividad> actividades;

    public Etapa(String nombre, ArrayList<Actividad> actividades) {
        this.nombre = nombre;
        this.actividades = actividades;
    }

    public void agregarActividades(String nombre, String descripcion, int duracionEstimada){
        Actividad actividad = new Actividad(nombre, descripcion, duracionEstimada);
        this.actividades.add(actividad);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    
}
