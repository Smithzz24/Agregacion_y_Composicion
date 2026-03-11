/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streaming;

import java.util.ArrayList;

/**
 * Una plataforma administra usuarios, planes de suscripción y contenido audiovisual.
Cada usuario tiene un plan activo. 
* Los planes tienen nombre, precio mensual y beneficios. 
* Un mismo plan puede estar asociado a muchos usuarios.
Las series disponibles están divididas en temporadas, y cada temporada contiene episodios con título y duración. 
* Si una temporada se elimina, sus episodios también desaparecen.
 * @author Smith
 */
public class Serie {
    private String nombre;
    private int añoLanzamiento;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String nombre, int añoLanzamiento, String genero, ArrayList temporadas) {
        this.nombre = nombre;
        this.añoLanzamiento = añoLanzamiento;
        this.genero = genero;
        this.temporadas = temporadas;
    }

    public void agregarTempordas(int numero, int cantidadEpisodios, ArrayList episodios){
        Temporada temporada = new Temporada (numero, cantidadEpisodios, episodios);
        this.temporadas.add(temporada);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList temporadas) {
        this.temporadas = temporadas;
    }
    
    
}
