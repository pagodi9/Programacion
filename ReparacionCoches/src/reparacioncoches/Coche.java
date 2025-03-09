/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reparacioncoches;


/**
 *
 * @author PcVIP
 */
public class Coche implements Comparable<Coche> {

    private String marca;
    private String modelo;
    private String matricula;
    private int añofabricacion;
    private int numreparaciones;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int añofabricacion, int numreparaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.añofabricacion = añofabricacion;
        this.numreparaciones = numreparaciones;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAñofabricacion() {
        return añofabricacion;
    }

    public int getNumreparaciones() {
        return numreparaciones;
    }
    
    @Override
    public int compareTo(Coche otroCoche) {
        return this.marca.compareToIgnoreCase(otroCoche.getMarca());
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\tModelo: " + modelo + "   Matrícula: " + matricula
                + "\nAño de fabricacion: " + añofabricacion + "   Num. Reparaciones: " + numreparaciones;
    }
}
