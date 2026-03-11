/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.editorial;
import java.time.LocalDate;
import java.util.ArrayList;
/**
Una editorial gestiona autores y publicaciones.
Un autor puede escribir varios libros. Cada libro tiene título, ISBN y fecha de publicación.
Cada libro está dividido en capítulos con título y número de páginas. 
* Si un libro se elimina, sus capítulos deben eliminarse también
 * @author Smith
 */
public class Libro {
    private String nombre;
    private String genero;
    private String ISBN;
    private LocalDate fechaPublicacion;
    private ArrayList<Capitulo> capitulos;

    public Libro(String nombre, String genero, String ISBN, LocalDate fechaPublicacion, ArrayList<Capitulo> capitulos) {
        this.nombre = nombre;
        this.genero = genero;
        this.ISBN = ISBN;
        this.fechaPublicacion = fechaPublicacion;
        this.capitulos = capitulos;
    }

    public void agregarCapitulos(String titulo, int numeroPaginas){
        Capitulo capitulo = new Capitulo(titulo, numeroPaginas);
        this.capitulos.add(capitulo);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(ArrayList<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
    
    
}
