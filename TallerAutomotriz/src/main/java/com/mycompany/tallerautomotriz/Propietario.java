/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerautomotriz;

import java.util.ArrayList;

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
public class Propietario {
    private String nombre;
    private int NumeroIdentificacion;
    private ArrayList<Vehiculo> vehiculos;

    public Propietario(String nombre, int NumeroIdentificacion, ArrayList vehiculos) {
        this.nombre = nombre;
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public void agregarVehiculos(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        this.vehiculos.remove(vehiculo);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(int NumeroIdentificacion) {
        this.NumeroIdentificacion = NumeroIdentificacion;
    }

    public ArrayList getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
}
