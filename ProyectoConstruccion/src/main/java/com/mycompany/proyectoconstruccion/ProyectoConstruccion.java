/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoconstruccion;
import java.util.ArrayList;
/**
 Una constructora maneja varios proyectos de obra. 
 * Cada proyecto tiene nombre, ubicación y presupuesto.
Los ingenieros pueden participar en diferentes proyectos. 
* Cada proyecto se divide en etapas (cimentación, estructura, acabados), y cada etapa tiene actividades específicas con duración estimada.
Si una etapa se elimina, las actividades relacionadas dejan de existir.

 * @author Smith
 */
public class ProyectoConstruccion {
    private String nombre;
    private String ubicacion;
    private int presupuesto;
    private ArrayList<Ingeniero> ingenieros;
    private ArrayList<Etapa> etapas;

    public ProyectoConstruccion(String nombre, String ubicacion, int presupuesto, ArrayList<Ingeniero> ingenieros, ArrayList<Etapa> etapas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.ingenieros = ingenieros;
        this.etapas = etapas;
    }

    public void agregarIngenieros(Ingeniero ingeniero){
        this.ingenieros.add(ingeniero);
    }
    
    public void eliminarIngenieros(Ingeniero ingeniero){
        this.ingenieros.remove(ingeniero);
    }
    
    public void agregarEtapas(String nombre, ArrayList<Actividad> actividades){
        Etapa etapa = new Etapa(nombre, actividades);
        this.etapas.add(etapa);
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Ingeniero> getIngenieros() {
        return ingenieros;
    }

    public void setIngenieros(ArrayList<Ingeniero> ingenieros) {
        this.ingenieros = ingenieros;
    }

    public ArrayList<Etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(ArrayList<Etapa> etapas) {
        this.etapas = etapas;
    }
    
    
    
}
