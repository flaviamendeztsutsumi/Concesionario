package dominio;

public class VehiculoTurismo extends Vehiculo {
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        super(marca, modelo, precioBase);
        this.numeroPlazas = numeroPlazas;
    }

    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return getPrecioBase();
        } else {
            int plazasNo5 = numeroPlazas - 5;
            double precioFinal = getPrecioBase() + (getPrecioBase() * 0.10 * plazasNo5);
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
