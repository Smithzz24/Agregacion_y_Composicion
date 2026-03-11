/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gym;

/**
 Un gimnasio registra entrenadores y clientes.
Cada cliente puede contratar diferentes planes de entrenamiento. 
* Los entrenadores pueden trabajar con varios clientes.
Cada plan de entrenamiento contiene rutinas específicas con lista de ejercicios. 
* Si el plan se elimina, sus rutinas desaparecen.
 
* @author Smith
 */
public class Ejercicio {
    private String nombre;
    private String musculo;
    private int repeticiones;
    private int series;
    private int tiempoDescanso;

    public Ejercicio(String nombre, String musculo, int repeticiones, int series, int tiempoDescanso) {
        this.nombre = nombre;
        this.musculo = musculo;
        this.repeticiones = repeticiones;
        this.series = series;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMusculo() {
        return musculo;
    }

    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(int tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }
    
    
}
