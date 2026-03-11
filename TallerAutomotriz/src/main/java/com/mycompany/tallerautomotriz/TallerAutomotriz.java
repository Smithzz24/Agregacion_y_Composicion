/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class TallerAutomotriz {

    private String nombre;
    private String direccion;
    private ArrayList<Mecanico> mecanicos;

    public TallerAutomotriz(String nombre, String direccion, ArrayList mecanicos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mecanicos = mecanicos;
    }

    public void agregarMecanicos (Mecanico mecanico){
        this.mecanicos.add(mecanico);
    }
    
    public void eliminarMecanicos (Mecanico mecanico){
        this.mecanicos.remove(mecanico);
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

    public ArrayList getMecanicos() {
        return mecanicos;
    }

    public void setMecanicos(ArrayList mecanicos) {
        this.mecanicos = mecanicos;
    }

    
}
