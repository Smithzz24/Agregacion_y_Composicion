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
public class PlanEntrenamiento {
    private int numeroPlan;
    private String nombre;
    private int cantidadDias;
    private ArrayList<Rutina> rutinas;

    public PlanEntrenamiento(int numeroPlan, String nombre, int cantidadDias, ArrayList<Rutina> rutinas) {
        this.numeroPlan = numeroPlan;
        this.nombre = nombre;
        this.cantidadDias = cantidadDias;
        this.rutinas = rutinas;
    }

    public void agregarRutina(String enfoque, int cantidadEjercicios, int duracionEstimada, ArrayList ejercicios){
        Rutina rutina = new Rutina(enfoque, cantidadEjercicios, duracionEstimada, ejercicios);
        this.rutinas.add(rutina);
    }
    public int getNumeroPlan() {
        return numeroPlan;
    }

    public void setNumeroPlan(int numeroPlan) {
        this.numeroPlan = numeroPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public ArrayList<Rutina> getRutinas() {
        return rutinas;
    }

    public void setRutinas(ArrayList<Rutina> rutinas) {
        this.rutinas = rutinas;
    }
    
    
}
