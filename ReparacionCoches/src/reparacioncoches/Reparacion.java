/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reparacioncoches;

/**
 *
 * @author PcVIP
 */
public class Reparacion {
    private int numreparacion;
    private String nomreparacion;
    private int Precio;
    private String Nombre;
    private String Apellido;
    private int Telefono;
    
    
    public Reparacion() {
    }

    public Reparacion(int numreparacion, String nomreparacion, int Precio, String Nombre, String Apellido, int Telefono) {
        this.numreparacion = numreparacion++;
        this.nomreparacion = nomreparacion;
        this.Precio = Precio;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
    }



    public int getNumreparacion() {
        return numreparacion;
    }

    public String getNomreparacion() {
        return nomreparacion;
    }

    public int getPrecio() {
        return Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getTelefono() {
        return Telefono;
    }
    
    
    @Override
    public String toString() {
        return "Num. Reparacion: " + numreparacion + "\tReparacion: " + nomreparacion + "   Precio: " + Precio
                + "\n-----------------------------------------------------------------\nDatos de la persona:\nNombre: " + Nombre + " " + Apellido + "\nTelefono: " + Telefono;
    }
}
