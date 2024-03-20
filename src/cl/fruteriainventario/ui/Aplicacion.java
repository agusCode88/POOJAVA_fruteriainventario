package cl.fruteriainventario.ui;

import cl.fruteriainventario.inventario.Inventario;
import cl.fruteriainventario.ventas.Transaccion;

import java.util.Scanner;

public class Aplicacion {
    private String nombreAplicacion;
    private Inventario inventario;
    private Transaccion transacción;

    public Aplicacion(String nombreAplicacion) {
       this.nombreAplicacion = nombreAplicacion;
       this.inventario = new Inventario();
       this.transacción = new Transaccion();
    }

    // Método para mostrar el menú de la aplicación
    // Método para mostrar el menú principal de la aplicación
    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Módulo de Inventario de frutas");
            System.out.println("2. Módulo de Ventas");
            System.out.println("3. Salir");
            System.out.print("Seleccione un módulo: ");

            // Validar si el usuario ingresa un número
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número.");
                System.out.print("Seleccione un módulo: ");
                scanner.next(); // Limpiar el buffer del scanner
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuInventario(scanner);
                    break;

                case 2:
                    menuTransacción();
                    break;
                case 3:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    // Método para mostrar el menú del módulo de Inventario
    private void menuInventario(Scanner scanner) {

        MenuInventario menuInventarioUI = new MenuInventario(this.inventario);
        menuInventarioUI.mostrarMenu();
    }

    // Método para mostrar el menú del módulo de Ventas
    private void menuTransacción() {
        // Implementar el menú para el módulo de Ventas
    }

}
