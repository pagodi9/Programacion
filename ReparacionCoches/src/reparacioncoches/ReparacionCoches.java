/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reparacioncoches;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PcVIP
 */
public class ReparacionCoches {

    static Scanner dato = new Scanner(System.in);
    static ArrayList<Coche> datocoche = new ArrayList<>();
    static ArrayList<Reparacion> reparar = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\t========");
            System.out.println("\t**MENU**");
            System.out.println("\t========\n");
            System.out.println("1-> Datos del coche");
            System.out.println("2-> Lista de los coches registrados");
            System.out.println("3-> Consulta de las reparaciones hechas");
            System.out.println("0-> SALIR.");
            System.out.print("\nSeleccionar la opcion a elegir: ");
            opcion = dato.nextInt();
            switch (opcion) {
                case 1 ->
                    ejercicio_1();
                case 2 ->
                    ejercicio_2();
                case 3 ->
                    ejercicio_3();
                case 0 -> {
                }
                default ->
                    System.out.println("Elija entre las opciones: ");
            }
            for (int i = 0; i <= 3; i++) {
                System.out.println("");
            }
        }
    }

    public static void ejercicio_1() {
        System.out.println("\t=================");
        System.out.println("\t*Datos del coche*");
        System.out.println("\t=================");

        System.out.println("");

        System.out.println("Ingrese la cantidad de coches a ingresar: ");
        int num = dato.nextInt();

        dato.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la marca del coche: ");
            String marca = dato.nextLine();

            System.out.println("Ingrese el modelo: ");
            String modelo = dato.nextLine();

            System.out.println("Ingrese la matrícula: ");
            String matricula = dato.nextLine();

            System.out.println("Ingrese el año de fabricacion: ");
            int añofabricacion = dato.nextInt();

            System.out.println("Ingrese la cantidad de reparaciones hechas: ");
            int numreparaciones = dato.nextInt();

            System.out.println("");

            datocoche.add(new Coche(marca, modelo, matricula, añofabricacion, numreparaciones));
        }

        System.out.println("\nDatos del coche: ");
        for (Coche coche : datocoche) {
            System.out.println("============================================");
            System.out.println(coche);
            System.out.println("============================================");
        }

    }
             
    public static void ejercicio_2() {
        agregarCoche("BMW", "E30", "2345TRC", 2006, 0);
        agregarCoche("FIAT", "500", "9382GTX", 2003, 1);
        agregarCoche("NISSAN", "GT-R", "2394SPT", 2010, 2);
        agregarCoche("LEXUS", "LS", "3234LKJ", 2018, 4);
        agregarCoche("CITROEN", "2CV", "3456SCD", 2008, 1);
        agregarCoche("BMW", "M3 E92", "8274JLM", 1998, 0);
        agregarCoche("NISSAN", "370Z", "5912KPQ", 1996, 0);

        System.out.println("\t=================");
        System.out.println("\t*Lista de coches*");
        System.out.println("\t=================");

        for (Coche coche : datocoche) {
            System.out.println("=====================================================");
            System.out.println(coche);
            System.out.println("=====================================================");
        }
    }

    public static void ejercicio_3() {
        System.out.println("\t==============");
        System.out.println("\t*Reparaciones*");
        System.out.println("\t==============");

        System.out.println("Listado de las reparaciones disponibles");
        System.out.println(" con toda la información requerida.");

        agregarReparacion(00001, "Motor", 200, "Javier", "Perez", 62232123);

        // Mostrar todos los alumnos del TreeSet
        for (Reparacion reparo : reparar) {
            System.out.println("============================================");
            System.out.println(reparo);
            System.out.println("============================================");
        }
    }

    public static void agregarCoche(String marca, String modelo, String matricula, int añofabricacion, int numreparaciones) {
        datocoche.add(new Coche(marca, modelo, matricula, añofabricacion, numreparaciones));
    }

    public static void agregarReparacion(int numreparacion, String nomreparacion, int precio, String Nombre, String Apellido, int Telefono) {
        reparar.add(new Reparacion(numreparacion, nomreparacion, precio, Nombre, Apellido, Telefono));
    }
}
