/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresaeventos;

import java.time.LocalDate;
import java.util.ArrayList;

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
public class Eventos {
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private ClienteResponsable clienteResponsable;
    private ArrayList<Proveedor> proveedores;
    private ArrayList<ActividadEspecifica> actividadesEspecificas;

    public Eventos(String nombre, LocalDate fecha, String lugar, ClienteResponsable clienteResponsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.clienteResponsable = clienteResponsable;
    }

    //Agregación
    public void agregarProveedor (Proveedor proveedor){
        this.proveedores.add(proveedor);
    }
    public void eliminarProveedor (Proveedor proveedor){
        this.proveedores.remove(proveedor);
    }
    public void agregarActividadEspecifica (String nombre, int horaInicio, float duracion, String responsable){
        ActividadEspecifica actividadEspecifica = new ActividadEspecifica(nombre, horaInicio, duracion, responsable);
        this.actividadesEspecificas.add(actividadEspecifica);
    }
    public void eliminarActividadEspecifica (ActividadEspecifica actividadEspecifica){
        this.actividadesEspecificas.remove(actividadEspecifica);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }   
    
    
}