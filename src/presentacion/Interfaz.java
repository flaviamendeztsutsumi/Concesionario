package presentacion;
import dominio.*;
import java.util.Scanner;

public class Interfaz {
    private Concesionario concesionario;
    private Scanner scanner;

    public Interfaz() {
        concesionario = new Concesionario();
        scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        System.out.println("=========       Menú       ============");
        System.out.println("|1. Agregar Vehículo de Turismo       |");
        System.out.println("|2. Agregar Furgoneta                 |");
        System.out.println("|3. Mostrar Vehículos de concesionario|");
        System.out.println("|4. Calcular Precio Total             |");
        System.out.println("|5. Salir                             |");
        System.out.print(" Elige una opción:");
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            menuPrincipal();
            String opcion = scanner.nextLine();

            if ("1".equals(opcion)) {
                agregarVehiculoTurismo();
            } else if ("2".equals(opcion)) {
                agregarFurgoneta();
            } else if ("3".equals(opcion)) {
                mostrarVehiculos();
            } else if ("4".equals(opcion)) {
                calcularPrecioTotal();
            } else if ("5".equals(opcion)) {
                continuar = false;
            } else {
                System.out.println("La opción que has elegido no esxiste.");
            }
        }
    }

    public void agregarVehiculoTurismo() {
        System.out.print("Marca del vehículo que quieres añadir: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo del vehículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Precio base del vehículo: ");
        double precioBase = Double.parseDouble(scanner.nextLine());

        System.out.print("¿Cúantas plazas tiene el vehículo? : ");
        int numPlazas = Integer.parseInt(scanner.nextLine());

        VehiculoTurismo vehiculoTurismo = new VehiculoTurismo(marca, modelo, precioBase, numPlazas);
        concesionario.agregarVehiculo(vehiculoTurismo);

        System.out.println("Vehiculo añadido.");
    }

    public void agregarFurgoneta() {
        System.out.print("Marca de la furgoneta: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo de la furgoneta: ");
        String modelo = scanner.nextLine();

        System.out.print("Precio base de la furgoneta: ");
        double precioBase = Double.parseDouble(scanner.nextLine());

        System.out.print("La capacidad en m3 de la furgoneta: ");
        double capacidadM3 = Double.parseDouble(scanner.nextLine());

        Furgoneta furgoneta = new Furgoneta(marca, modelo, precioBase, capacidadM3);
        concesionario.agregarVehiculo(furgoneta);

        System.out.println("Furgoneta añadida");
    }

    public void mostrarVehiculos() {
        concesionario.mostrarVehiculos();
    }

    public void calcularPrecioTotal() {
        double precioTotal = concesionario.calcularPrecioTotal();
        System.out.println("El precio total de los vehículos del concesionario es: " + precioTotal);
    }

}
