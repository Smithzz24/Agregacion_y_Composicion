/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerautomotriz;

/**
 Un taller mecánico registra vehículos, propietarios y órdenes de servicio.
Cada propietario tiene nombre y número de identificación. 
* Un propietario puede tener varios vehículos.
Cuando un vehículo ingresa al taller se genera una orden de servicio que incluye fecha, descripción del problema y mecánico asignado. 
* Cada orden puede incluir varios trabajos realizados, con su respectivo costo.
Si se elimina una orden de servicio, los trabajos asociados deben eliminarse también. 
* Los mecánicos pueden trabajar en diferentes talleres.

 * @author Smith
 */
public class Mecanico {
    private String nombre;
    private int telefono;
    private String email;

    public Mecanico(String nombre, int telefono, String email) {
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
