package dominio;

public class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(String marca, String modelo, double precioBase, double capacidadM3) {
        super(marca, modelo, precioBase);
        this.capacidadM3 = capacidadM3;
    }

    public double calcularPrecioFinal() {
        return getPrecioBase() * 0.5 * Math.cbrt(capacidadM3);
    }

    public String toString() {
        return super.toString() + ", Capacidad en m3: " + capacidadM3;
    }

    public double getCapacidadM3() {
        return capacidadM3;
    }

    public void setCapacidadM3(double capacidadM3) {
        this.capacidadM3 = capacidadM3;
    }
}
