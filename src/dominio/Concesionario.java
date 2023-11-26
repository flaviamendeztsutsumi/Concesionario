package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Concesionario implements Serializable {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Vehiculo vehiculo : vehiculos) {
            precioTotal += vehiculo.calcularPrecioFinal();
        }
        return precioTotal;
    }
}
