/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerautomotriz;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 Un taller mecánico registra vehículos, propietarios y órdenes de servicio.
Cada propietario tiene nombre y número de identificación. 
* Un propietario puede tener varios vehículos.
Cuando un vehículo ingresa al taller se genera una orden de servicio que incluye fecha, descripción del problema y mecánico asignado. 
* Cada orden puede incluir varios trabajos realizados, con su respectivo costo.
Si se elimina una orden de servicio, los trabajos asociados deben eliminarse también. 
* Los mecánicos pueden trabajar en diferentes talleres.

 * @author Smith
 */
class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private ArrayList<OrdenServicio> ordenesServicios;

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public void agregarOrdenesServicios (LocalDate fecha, String descripcion, Mecanico mecanicoAsignado, ArrayList trabajos){
        OrdenServicio ordenServicio = new OrdenServicio(fecha, descripcion, mecanicoAsignado, trabajos);
        this.ordenesServicios.add(ordenServicio);
        }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList getOrdenesServicios() {
        return ordenesServicios;
    }

    public void setOrdenesServicios(ArrayList ordenesServicios) {
        this.ordenesServicios = ordenesServicios;
    }
    
    
}
