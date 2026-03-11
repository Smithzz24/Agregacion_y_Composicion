/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.editorial;
import java.util.ArrayList;
/**
Una editorial gestiona autores y publicaciones.
Un autor puede escribir varios libros. Cada libro tiene título, ISBN y fecha de publicación.
Cada libro está dividido en capítulos con título y número de páginas. 
* Si un libro se elimina, sus capítulos deben eliminarse también
 * @author Smith
 */
public class Autor {
    private String nombre;
    private int telefono;
    private String email;
    private ArrayList<Libro> libros;

    public Autor(String nombre, int telefono, String email, ArrayList libros) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.libros = libros;
    }

    public void agregarLibros(Libro libro){
        this.libros.add(libro);
    }
    public void eliminarLibro(Libro libro){
        this.libros.remove(libro);
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

    public ArrayList getLibros() {
        return libros;
    }

    public void setLibros(ArrayList libros) {
        this.libros = libros;
    }
    
    
}
