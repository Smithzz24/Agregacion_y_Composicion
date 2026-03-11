/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoconstruccion;

/**
  Una constructora maneja varios proyectos de obra. 
 * Cada proyecto tiene nombre, ubicación y presupuesto.
Los ingenieros pueden participar en diferentes proyectos. 
* Cada proyecto se divide en etapas (cimentación, estructura, acabados), y cada etapa tiene actividades específicas con duración estimada.
Si una etapa se elimina, las actividades relacionadas dejan de existir.
 * @author Smith
 */
public class Actividad {
    private String nombre;
    private String descripcion;
    private int duracionEstimada;

    public Actividad(String nombre, String descripcion, int duracionEstimada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracionEstimada = duracionEstimada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }
    
    
}
