/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaviajes;
import java.util.ArrayList;

/**
Una agencia organiza viajes para sus clientes.
Cada viaje tiene destino, fecha y costo. 
* Un cliente puede reservar varios viajes.
Dentro de cada viaje se incluyen reservas de hotel y actividades programadas. 
* Si el viaje se cancela y se elimina del sistema, las reservas y actividades asociadas también desaparecen.
 * @author Smith
 */
public class Cliente {
    private String nombre;
    private int telefono;
    private String email;
    private ArrayList<Viaje> viajes;

    public Cliente(String nombre, int telefono, String email, ArrayList<Viaje> viajes) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.viajes = viajes;
    }

    public void agregarViajes(Viaje viaje){
        this.viajes.add(viaje);
    }
    
    public void elimarViajes(Viaje viaje){
        this.viajes.remove(viaje);
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

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }
    
    
}