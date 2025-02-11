package TEMA5;

import java.util.Scanner;

class Zona {
    private String nombre;
    private int entradasDisponibles;

    public Zona(String nombre, int entradasDisponibles) {
        this.nombre = nombre;
        this.entradasDisponibles = entradasDisponibles;
    }

    public int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public boolean venderEntradas(int cantidad) {
        if (cantidad <= entradasDisponibles) {
            entradasDisponibles -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + entradasDisponibles  + "entradas disponibles";
    }
}

public class ExpocochesAtarfe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear zonas
        Zona salaPrincipal = new Zona("Sala Principal", 1000);
        Zona compraVenta = new Zona("Zona Compra-Venta", 200);
        Zona zonaVIP = new Zona("Zona VIP", 25);

        int opcion;
        do {
            // Menú principal
            System.out.println("\n--- Gestión de Entradas ---");
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar entradas disponibles
                    System.out.println(salaPrincipal);
                    System.out.println(compraVenta);
                    System.out.println(zonaVIP);
                    break;

                case 2:
                    // Vender entradas
                    System.out.println("\n¿Para qué zona quieres las entradas?");
                    System.out.println("1. Sala Principal");
                    System.out.println("2. Zona Compra-Venta");
                    System.out.println("3. Zona VIP");
                    System.out.print("Elige una zona: ");
                    int zonaSeleccionada = scanner.nextInt();

                    System.out.print("¿Cuántas entradas deseas? ");
                    int cantidad = scanner.nextInt();

                    Zona zonaSeleccionadaObj;
                    switch (zonaSeleccionada) {
                        case 1:
                            zonaSeleccionadaObj = salaPrincipal;
                            break;
                        case 2:
                            zonaSeleccionadaObj = compraVenta;
                            break;
                        case 3:
                            zonaSeleccionadaObj = zonaVIP;
                            break;
                        default:
                            System.out.println("Zona no válida.");
                            continue;
                    }

                    if (zonaSeleccionadaObj.venderEntradas(cantidad)) {
                        System.out.println("Entradas vendidas correctamente.");
                    } else {
                        System.out.println("No hay suficientes entradas disponibles.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
