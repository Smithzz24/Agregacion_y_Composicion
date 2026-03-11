        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streaming;
import java.util.ArrayList;

/**
 Una plataforma administra usuarios, planes de suscripción y contenido audiovisual.
Cada usuario tiene un plan activo. 
* Los planes tienen nombre, precio mensual y beneficios. 
* Un mismo plan puede estar asociado a muchos usuarios.
Las series disponibles están divididas en temporadas, y cada temporada contiene episodios con título y duración. 
* Si una temporada se elimina, sus episodios también desaparecen.
 * @author Smith
 */
public class Temporada {
    private int numero;
    private int cantidadEpisodios;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero, int cantidadEpisodios, ArrayList episodios) {
        this.numero = numero;
        this.cantidadEpisodios = cantidadEpisodios;
    }
    
    public void agregarEpisodios(String titulo, int duracion){
        Episodio episodio = new Episodio (titulo, duracion);
        this.episodios.add(episodio);
    }
    
    public void eliminarEpisodio(Episodio episodio){
        this.episodios.remove(episodio);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidadEpisodios() {
        return cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public ArrayList getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList episodios) {
        this.episodios = episodios;
    }
    
    
}
