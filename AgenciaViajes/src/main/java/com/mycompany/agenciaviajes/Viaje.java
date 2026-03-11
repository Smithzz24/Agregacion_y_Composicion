/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agenciaviajes;
import java.util.ArrayList;
import java.time.LocalDate;
/**
Una agencia organiza viajes para sus clientes.
Cada viaje tiene destino, fecha y costo. 
* Un cliente puede reservar varios viajes.
Dentro de cada viaje se incluyen reservas de hotel y actividades programadas. 
* Si el viaje se cancela y se elimina del sistema, las reservas y actividades asociadas también desaparecen.
 * @author Smith
 */
public class Viaje {
    private String destino;
    private LocalDate fecha;
    private float costo;
    private ArrayList<ReservaHotel> reservasHotel;

    public Viaje(String destino, LocalDate fecha, float costo, ArrayList<ReservaHotel> reservasHotel) {
        this.destino = destino;
        this.fecha = fecha;
        this.costo = costo;
        this.reservasHotel = reservasHotel;
    }

    public void agregarReservas(String nombre, String direccion, LocalDate fechaInicio, LocalDate fechaFin, ArrayList<ActividadProgramada> actividadesProgramadas){
        ReservaHotel reservaHotel = new ReservaHotel(nombre, direccion, fechaInicio, fechaFin, actividadesProgramadas);
        this.reservasHotel.add(reservaHotel);
    }
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<ReservaHotel> getReservasHotel() {
        return reservasHotel;
    }

    public void setReservasHotel(ArrayList<ReservaHotel> reservasHotel) {
        this.reservasHotel = reservasHotel;
    }
}
