package farkus_app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Generar Venta");
            System.out.println("2. Gestionar Taller");
            System.out.println("3. Gestionar Inventario");
            System.out.println("4. Historial");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste: Generar Boleta");
                    // Aqui ira el menu de boleta
                    break;
                case 2:
                    System.out.println("Seleccionaste: Gestionar Taller");
                    // Aqui ira el menu de taller
                    break;
                case 3:
                    System.out.println("Seleccionaste: Gestionar Inventario");
                    // Aqui ira el menu de inventario
                    break;
                case 4:
                    System.out.println("Seleccionaste: Historial");
                    // Aqui ira el menu de historial
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }
            System.out.println(); // Espacio entre lineas
        } while (opcion != 5);

        scanner.close();
    }
}
