/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerautomotriz;
import java.util.ArrayList;
import java.time.LocalDate;

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
class OrdenServicio {
    private LocalDate fecha;
    private String descripcion;
    private Mecanico mecanicoAsignado;
    private ArrayList<Trabajo> trabajos;

    public OrdenServicio(LocalDate fecha, String descripcion, Mecanico mecanicoAsignado, ArrayList<Trabajo> trabajos) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.mecanicoAsignado = mecanicoAsignado;
        this.trabajos = trabajos;
    }

    public void agregarTrabajo (String nombre, float costo){
        Trabajo trabajo = new Trabajo(nombre, costo);
        this.trabajos.add(trabajo);
    }
    
    public void eliminarTrabajo (Trabajo trabajo){
        this.trabajos.remove(trabajo);
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public ArrayList getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(ArrayList trabajos) {
        this.trabajos = trabajos;
    }
    
    
}
