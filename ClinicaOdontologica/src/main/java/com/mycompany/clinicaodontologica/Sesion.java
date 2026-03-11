                    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicaodontologica;
import java.time.LocalDate;

/**
  *Una clínica odontológica quiere organizar mejor su información.
Registra los datos de los odontólogos que trabajan allí, incluyendo su nombre, especialidad y número de tarjeta profesional. 
También guarda información de los pacientes, como nombre, documento y teléfono.
Cada paciente puede tener varios tratamientos. Cada tratamiento tiene fecha de inicio, diagnóstico y costo estimado. 
Además, por cada tratamiento se registran sesiones individuales con fecha y procedimiento realizado.
Si un tratamiento se elimina del sistema, también deben desaparecer sus sesiones asociadas. 
Los odontólogos pueden atender pacientes en otras clínicas.
 * @author Smith
 */
public class Sesion {
    private LocalDate fecha;
    private String procedimientoRealizado;

    public Sesion(LocalDate fecha, String procedimientoRealizado) {
        this.fecha = fecha;
        this.procedimientoRealizado = procedimientoRealizado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getProcedimientoRealizado() {
        return procedimientoRealizado;
    }

    public void setProcedimientoRealizado(String procedimientoRealizado) {
        this.procedimientoRealizado = procedimientoRealizado;
    }
    
    
}
