package cl.fruteriainventario.ui;

import cl.fruteriainventario.ventas.Transaccion;

import java.util.Scanner;

public class MenuVentas {
    private Transaccion transaccion;

    // Constructor
    public MenuVentas(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    // Método para mostrar el menú del módulo de Ventas
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Ventas ===");
            System.out.println("1. Realizar Venta");
            System.out.println("2. Mostrar Ventas");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            // Validar si el usuario ingresa un número
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número.");
                System.out.print("Seleccione una opción: ");
                scanner.next(); // Limpiar el buffer del scanner
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Lógica para realizar una venta
                    break;
                case 2:
                    // Lógica para mostrar las ventas
                    break;
                case 3:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

}
