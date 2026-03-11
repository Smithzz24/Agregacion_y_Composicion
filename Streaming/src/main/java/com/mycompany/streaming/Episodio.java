/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streaming;

/**
 Una plataforma administra usuarios, planes de suscripción y contenido audiovisual.
Cada usuario tiene un plan activo. 
* Los planes tienen nombre, precio mensual y beneficios. 
* Un mismo plan puede estar asociado a muchos usuarios.
Las series disponibles están divididas en temporadas, y cada temporada contiene episodios con título y duración. 
* Si una temporada se elimina, sus episodios también desaparecen.
 * @author Smith
 */
public class Episodio {
    private String titulo;
    private int duracion;

    public Episodio(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
}
