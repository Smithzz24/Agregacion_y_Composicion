/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.editorial;

/**
Una editorial gestiona autores y publicaciones.
Un autor puede escribir varios libros. Cada libro tiene título, ISBN y fecha de publicación.
Cada libro está dividido en capítulos con título y número de páginas. 
* Si un libro se elimina, sus capítulos deben eliminarse también
 * @author Smith
 */
public class Capitulo {
    private String titulo;
    private int numeroPaginas;

    public Capitulo(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    
    
}
