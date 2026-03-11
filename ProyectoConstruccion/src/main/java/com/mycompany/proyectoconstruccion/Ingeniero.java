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
public class Ingeniero {
    private String nombre;
    private int telefono;
    private String email;

    public Ingeniero(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
