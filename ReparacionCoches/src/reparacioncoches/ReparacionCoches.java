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
        listacoche();
        menu();
    }

    public static void menu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\t========");
            System.out.println("\t**MENU**");
            System.out.println("\t========\n");
            System.out.println("1-> Alta del coche.");
            System.out.println("2-> Lista de los coches registrados.");
            System.out.println("3-> Lista de reparaciones disponibles.");
            System.out.println("4-> Agregar una nueva reparacion.");
            System.out.println("5-> Consulta de las reparaciones hechas.");
            System.out.println("6-> Maximas y Minimas.");
            System.out.println("7-> Mostrar los coches que no tienen ninguna reparacion.");
            System.out.println("8-> Pedir consulta con alguno de nuestros trabajadores.");
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
                case 4 ->
                    ejercicio_4();
                case 5 ->
                    ejercicio_5();
                case 6 ->
                    ejercicio_6();
                case 7 ->
                    ejercicio_7();
                case 8 ->
                    ejercicio_8();
                case 0 -> {
                }
                default ->
                    System.out.println("Elija entre las opciones: ");
            }
            System.out.println("\n\n");
        }
    }

    public static void listacoche() {
        if (datocoche.isEmpty()) {
            agregarCoche("BMW", "E30", "2345TRC", 2006, 0);
            agregarCoche("FIAT", "500", "9382GTX", 2003, 1);
            agregarCoche("NISSAN", "GT-R", "2394SPT", 2010, 2);
            agregarCoche("LEXUS", "LS", "3234LKJ", 2018, 4);
            agregarCoche("CITROEN", "2CV", "3456SCD", 2008, 1);
            agregarCoche("BMW", "M3 E92", "8274JLM", 1998, 0);
            agregarCoche("NISSAN", "370Z", "5912KPQ", 1996, 0);
        }
    }

    public static void ejercicio_1() {
        System.out.println("\t=================");
        System.out.println("\t*Datos del coche*");
        System.out.println("\t=================");

        System.out.println("");
        System.out.println("\nIngrese la cantidad de coches a ingresar: ");
        int num = dato.nextInt();
        dato.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nIngrese la matricula del coche: ");
            String matricula = dato.nextLine();

            if (existeCoche(matricula)) {
                System.out.println("Error: Un coche con la matricula " + matricula + " ya esta registrado.");
                i--;
                continue;
            }
            System.out.println("Ingrese la marca del coche: ");
            String marca = dato.nextLine();

            System.out.println("Ingrese el modelo: ");
            String modelo = dato.nextLine();

            System.out.println("Ingrese el año de fabricacion: ");
            int añofabricacion = dato.nextInt();

            System.out.println("Ingrese la cantidad de reparaciones hechas: ");
            int numreparaciones = dato.nextInt();
            dato.nextLine();

            datocoche.add(new Coche(marca, modelo, matricula, añofabricacion, numreparaciones));
        }

    }

    public static void ejercicio_2() {
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

        System.out.println("Listado de las reparaciones con toda la informacion requerida.");

        System.out.println("");
        System.out.println("Los precios varian dependiendo de las condiciones en las");
        System.out.println("que se encuentre el coche, marca o modelo.");

        System.out.println("1-> Cambio de aceite y filtros.");
        System.out.println("2-> Reemplazo de pastillas y discos de freno.");
        System.out.println("3-> Reemplazo o reparacion del sistema de escape.");
        System.out.println("4-> Reparacion de suspension (amortiguadores, resortes, etc).");
        System.out.println("5-> Reemplazo de correas y cadenas de distribucion.");
        System.out.println("6-> Revision y reparacion del sistema de climatizacion (A/C y calefacción.)");
        System.out.println("7-> Cambio de bujias y cables de encendido.");
        System.out.println("8-> Reparacion de sistema de direccion (bomba de direccion asistida, rótulas, etc).");
        System.out.println("9-> Reemplazo de bateria.");
        System.out.println("10-> Reparacion de transmision o embrague.");
        System.out.println("11-> Inspeccion y reparacion de la suspension delantera y trasera.");
        System.out.println("12-> Reparacion de la caja de cambios (manual o automatica.");
        System.out.println("13-> Reemplazo de neumaticos y balanceo de ruedas.");
        System.out.println("14-> Revision y reparacion de sistemas de freno (bomba, liquidos de freno, etc).");
        System.out.println("15-> Otros (consulta al 98458652)");

        System.out.println("");
        System.out.println("");
    }

    public static void ejercicio_4(){
        System.out.println("");
        
        
        System.out.println("\nIngrese cuantas reparaciones haras: ");
        int num = dato.nextInt();
        dato.nextLine();
        
        for (int i = 0; i < num; i++) {
            
            System.out.println("Numero de la reparacion");
            int numreparacion = dato.nextInt();
            dato.nextLine();

            System.out.println("Reparacion:  ");
            String nomreparacion = dato.nextLine();
            
            System.out.println("Precio de la reparacion: ");
            int precio = dato.nextInt();
            dato.nextLine();
            
            System.out.println("Nombre del propietario: ");
            String Nombre = dato.nextLine();
            
            System.out.println("Apellido del propietario: ");
            String Apellido = dato.nextLine();
            
            System.out.println("Telefono: ");
            int Telefono = dato.nextInt();
           
            dato.nextLine();
            reparar.add(new Reparacion(numreparacion, nomreparacion, precio, Nombre, Apellido, Telefono));
        }
            
            for (Reparacion reparo : reparar) {
            System.out.println("=================================================================");
            System.out.println(reparo);
            System.out.println("=================================================================");
        }
    }
    
    public static void ejercicio_5() {
        System.out.println("Listado de las reparaciones hechas");
        System.out.println(" con toda la información requerida.");

        System.out.println("");
        agregarReparacion(8, "Motor", 6500, "Javier", "Perez", 62232123);
        agregarReparacion(7, "Luces delanteras", 200, "Sara", "Martin", 69385421);
        agregarReparacion(6, "Revision Frenado", 400, "Javier", "Perez", 62232123);
        agregarReparacion(5, "Escape", 100, "Rocio", "Cabal", 68752465);
        agregarReparacion(4, "Embrague", 4000, "Sara", "Martin", 69385421);
        agregarReparacion(3, "Revision Motor", 400, "Javier", "Perez", 62232123);
        agregarReparacion(2, "Climatizacion", 250, "Joel", "Pratt", 65245875);
        agregarReparacion(1, "Rueda", 400, "Javier", "Perez", 62232123);

        // Mostrar todos los alumnos del TreeSet
        for (Reparacion reparo : reparar) {
            System.out.println("=================================================================");
            System.out.println(reparo);
            System.out.println("=================================================================");
        }
    }

    public static void ejercicio_6(){     
        System.out.println("\t===========");
        System.out.println("\t*Max y Min*");
        System.out.println("\t===========");
        
        System.out.println("En este apartado buscaremos en nuestra lista quienes son ");
        System.out.println("los vehiculos que tienen mayores reparaciones en este taller.");
       
        System.out.println("El vehículo que tiene mayores visitas al taller es: " + datocoche.get(4)); 
    
    }
    
    public static void ejercicio_7(){
    }
    
    public static void ejercicio_8() {
        System.out.println("======================");
        System.out.println("Nuestros trabajadores:");
        System.out.println("======================\n");

        imprimirTrabajador("Lucia Rodriguez", "693423428", "4 anhos y 1 mes", "Subdirectora e Ingeniera mecanica");
        imprimirTrabajador("Rodrigo Castanhuelas", "645645622", "6 meses", "Tecnico Superior en Automocion");
        imprimirTrabajador("Catalino Sortez", "623425544", "2 anhos y 5 meses", "Grado superior de Mantenimiento Aeromecanico");
        imprimirTrabajador("Sancho Lorcho", "672342345", "8 anhos y 9 meses", "Director e Ingeniero automotriz");

        int persona;
        do {
            System.out.println("\t========");
            System.out.println("\t**CITA**");
            System.out.println("\t========\n");
            System.out.println("1 -> Lucia");
            System.out.println("2 -> Rodrigo");
            System.out.println("3 -> Catalino");
            System.out.println("4 -> Sancho");
            System.out.println("0 -> SALIR.");
            System.out.print("\nSeleccionar la opcionn a elegir: ");
            
            persona = dato.nextInt();
            switch (persona) {
                case 1 -> opcion_1();
                case 2 -> opcion_2();
                case 3 -> opcion_3();
                case 4 -> opcion_4();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opcion invalida, intenta de nuevo.");
            }
        } while (persona != 0);
    }
    public static void imprimirTrabajador(String nombre, String telefono, String años, String especialidad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Anhos trabajados: " + años);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("");
    }
    public static void opcion_1() {
        mostrarHorarios("Lucia", "Lunes", "Miercoles", "Viernes", new int[][] {
            {31, 7, 14, 21, 28},
            {2, 9, 16, 23, 30},
            {4, 11, 18, 25}
        }, "16:00", "22:00");
    }
    public static void opcion_2() {
        mostrarHorarios("Rodrigo", "Martes", "Jueves", "Sabado", new int[][] {
            {1, 8, 15, 22, 29},
            {3, 10, 17, 24},
            {5, 12, 19, 26}
        }, "16:00", "22:00");
    }
    public static void opcion_3() {
        mostrarHorarios("Catalino", "Lunes", "Miercoles", "Viernes", new int[][] {
            {31, 7, 14, 21, 28},
            {2, 9, 16, 23, 30},
            {4, 11, 18, 25}
        }, "9:00", "16:00");
    }
    public static void opcion_4() {
        mostrarHorarios("Sancho", "Martes", "Jueves", "Sabado", new int[][] {
            {1, 8, 15, 22, 29},
            {3, 10, 17, 24},
            {5, 12, 19, 26}
        }, "9:00", "16:00");
    }
   
    public static void mostrarHorarios(String nombre, String dia1, String dia2, String dia3, int[][] mes, String horaInicio, String horaFin) {
        System.out.println("===================");
        System.out.println("Cita con " + nombre);
        System.out.println("===================\n");
        System.out.println("Meses: Abril");
        System.out.println("Dias disponibles:\n");

        System.out.println("===========================");
        System.out.printf("%-10s%-10s%-10s\n", dia1, dia2, dia3);
        System.out.println("===========================");
        for (int i = 0; i < mes[0].length; i++) {
            System.out.printf("%-10d%-10d%-10d\n",
                (i < mes[0].length ? mes[0][i] : 0),
                (i < mes[1].length ? mes[1][i] : 0),
                (i < mes[2].length ? mes[2][i] : 0));
        }
        System.out.println("===========================");
        System.out.println("\nHorarios disponibles desde las " + horaInicio + " hasta las " + horaFin);
        System.out.println("\nVolviendo al menu principal...\n");
    }
    
    public static void agregarReparacion(int numreparacion, String nomreparacion, int precio, String Nombre, String Apellido, int Telefono) {
        reparar.add(new Reparacion(numreparacion, nomreparacion, precio, Nombre, Apellido, Telefono));
    }

    public static void agregarCoche(String marca, String modelo, String matricula, int añofabricacion, int numreparaciones) {
        datocoche.add(new Coche(marca, modelo, matricula, añofabricacion, numreparaciones));
    }

    public static boolean existeCoche(String matricula) {
        for (Coche c : datocoche) {
            if (c.getMatricula().equalsIgnoreCase(matricula)) {
                return true; // Ya existe un coche con esta matrícula
            }
        }
        return false;
    }

}
