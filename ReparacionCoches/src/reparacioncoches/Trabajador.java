/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reparacioncoches;

/**
 *
 * @author diego
 */
public class Trabajador {
    private String Nombre;
    private String Apellido;
    private int AnhosLaborales;
    private int Telefono;
    private int Horarios;
    private boolean Disponibilidad;

    public Trabajador() {
    }

    public Trabajador(String Nombre, String Apellido, int AnhosLaborales, int Telefono, int Horarios, boolean Disponibilidad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.AnhosLaborales = AnhosLaborales;
        this.Telefono = Telefono;
        this.Horarios = Horarios;
        this.Disponibilidad = Disponibilidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getAnhosLaborales() {
        return AnhosLaborales;
    }

    public int getTelefono() {
        return Telefono;
    }

    public int getHorarios() {
        return Horarios;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }
    
    
    
}
