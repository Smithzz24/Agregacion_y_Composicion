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
public class Rutina {
    private int numeroRutina;
    private String enfoque;
    private int cantidadEjercicios;
    private int duracionEstimada;
    private ArrayList<Ejercicio> ejercicios;

    public Rutina(int numeroRutina, String enfoque, int cantidadEjercicios, int duracionEstimada, ArrayList<Ejercicio> ejercicios) {
        this.enfoque = enfoque;
        this.cantidadEjercicios = cantidadEjercicios;
        this.duracionEstimada = duracionEstimada;
        this.ejercicios = ejercicios;
    }

    public void agregarEjercicios(String nombre, String musculo, int repeticiones, int series, int tiempoDescanso){
        Ejercicio ejercicio = new Ejercicio(nombre, musculo, repeticiones, series, tiempoDescanso);
        this.ejercicios.add(ejercicio);
    }
    
    
    public String getEnfoque() {
        return enfoque;
    }

    public void setEnfoque(String enfoque) {
        this.enfoque = enfoque;
    }

    public int getCantidadEjercicios() {
        return cantidadEjercicios;
    }

    public void setCantidadEjercicios(int cantidadEjercicios) {
        this.cantidadEjercicios = cantidadEjercicios;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    public ArrayList<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }
    
    
    
}
