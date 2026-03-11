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
public class Usuario {
    private String nombre;
    private int telefono;
    private String email;
    private String contraseña;
    private PlanSuscripcion planSuscripcion;

    public Usuario(String nombre, int telefono, String email, String contraseña, PlanSuscripcion planSuscripcion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
        this.planSuscripcion = planSuscripcion;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public PlanSuscripcion getPlanSuscripcion() {
        return planSuscripcion;
    }

    public void setPlanSuscripcion(PlanSuscripcion planSuscripcion) {
        this.planSuscripcion = planSuscripcion;
    }
    
    
}
