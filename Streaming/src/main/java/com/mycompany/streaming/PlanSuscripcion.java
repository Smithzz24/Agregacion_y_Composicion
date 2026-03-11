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
class PlanSuscripcion {
    private String nombre;
    private int precioMensual;
    private String beneficios;

    public PlanSuscripcion(String nombre, int precioMensual, String beneficios) {
        this.nombre = nombre;
        this.precioMensual = precioMensual;
        this.beneficios = beneficios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(int precioMensual) {
        this.precioMensual = precioMensual;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
    
    
}
