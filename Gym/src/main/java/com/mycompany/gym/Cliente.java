/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gym;
import java.util.ArrayList;
/**
 Un gimnasio registra entrenadores y clientes.
Cada cliente puede contratar diferentes planes de entrenamiento. 
* Los entrenadores pueden trabajar con varios clientes.
Cada plan de entrenamiento contiene rutinas específicas con lista de ejercicios. 
* Si el plan se elimina, sus rutinas desaparecen.
 * @author Smith
 */
public class Cliente {
    private String nombre;
    private int telefono;
    private String email;
    private ArrayList<PlanEntrenamiento> planesEntrenamiento;

    public Cliente(String nombre, int telefono, String email, ArrayList planesEntrenamiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.planesEntrenamiento = planesEntrenamiento;
    }

    public void agregarPlanEntrenamiento(PlanEntrenamiento planEntrenamiento){
        this.planesEntrenamiento.add(planEntrenamiento);
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

    public ArrayList getPlanesEntrenamiento() {
        return planesEntrenamiento;
    }

    public void setPlanesEntrenamiento(ArrayList planesEntrenamiento) {
        this.planesEntrenamiento = planesEntrenamiento;
    }
    
    
}
