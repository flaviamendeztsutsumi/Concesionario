package dominio;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        super(marca, modelo, precioBase);
        this.numeroPlazas = numeroPlazas;
    }

    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return getPrecioBase(); // El precio es el precio base
        } else {
            // Calcular el precio con aumento del 10% por cada plaza que supere las cinco
            int plazasExtra = numeroPlazas - 5;
            double aumentoPorPlaza = 0.10; // 10%
            double precioFinal = getPrecioBase() + (getPrecioBase() * aumentoPorPlaza * plazasExtra);
            return precioFinal;
        }
    }

   
    public String toString() {
        return super.toString() + ", Número de Plazas: " + numeroPlazas;
    }



    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}
