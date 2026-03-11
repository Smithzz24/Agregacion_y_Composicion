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
public class Entrenador {
    private String nombre;
    private int telefono;
    private String email;
    private ArrayList<Cliente> clientes;

    public Entrenador(String nombre, int telefono, String email, ArrayList<Cliente> clientes) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.clientes = clientes;
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    
}
