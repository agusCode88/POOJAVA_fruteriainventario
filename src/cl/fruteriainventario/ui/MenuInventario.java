package cl.fruteriainventario.ui;

import cl.fruteriainventario.inventario.Inventario;

import java.util.Scanner;

public class MenuInventario {
    Inventario inventario;

    // Constructor
    public MenuInventario(Inventario inventario) {
        if (inventario == null) {
            System.out.println("No se ha encontrado ningún inventario. Creando uno nuevo...");
            this.inventario = new Inventario();
        } else {
            this.inventario = inventario;
        }

    }

    // Método para mostrar el menú del módulo de Inventario
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú de Inventario ===");
            System.out.println("1. Mostrar Inventario");
            System.out.println("2. Agregar Fruta al Inventario");
            System.out.println("3. Editar Fruta en el Inventario");
            System.out.println("4. Eliminar Fruta del Inventario");
            System.out.println("5. Volver al Menú Principal");
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
                    //inventario.mostrarInventario();
                    break;
                case 2:
                    // Lógica para agregar una fruta al inventario
                    break;
                case 3:
                    // Lógica para editar una fruta en el inventario
                    break;
                case 4:
                    // Lógica para eliminar una fruta del inventario
                    break;
                case 5:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}
