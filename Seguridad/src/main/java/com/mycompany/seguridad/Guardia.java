/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguridad;

/**
  Una empresa de seguridad contrata guardias y presta servicios a distintas compañías.
Cada servicio tiene fecha de inicio, duración y empresa contratante. 
* Los guardias pueden ser asignados a distintos servicios.
Para cada servicio se registran turnos diarios con hora de inicio y fin. 
* Si el servicio termina y se elimina del sistema, los turnos asociados también deben eliminarse.
 * @author Smith
 */
class Guardia {
    private String nombre;
    private int telefono;
    private String email;

    public Guardia(String nombre, int telefono, String email) {
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
