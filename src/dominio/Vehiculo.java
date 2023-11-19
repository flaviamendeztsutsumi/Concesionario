package dominio;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable {
    protected String marca;
    protected String modelo;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();

  
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Precio Base: " + precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
