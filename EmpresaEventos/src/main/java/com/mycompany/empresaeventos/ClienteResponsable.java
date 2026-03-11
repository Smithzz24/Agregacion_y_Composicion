/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresaeventos;

/**
 Una empresa organiza eventos corporativos. 
* Cada evento tiene nombre, fecha y lugar. 
* Para cada evento se contrata un cliente responsable.
Los eventos cuentan con proveedores (sonido, iluminación, catering), cada uno con sus propios datos de contacto. 
* Un proveedor puede participar en varios eventos.
Dentro de cada evento se planifican actividades específicas con hora de inicio, duración y responsable asignado. 
* Si el evento se cancela, las actividades programadas dejan de existir.
 * @author Smith
 */
class ClienteResponsable {
    private String nombre;
    private String email;
    private int telefono;

    public ClienteResponsable(String nombre, String email, int telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
