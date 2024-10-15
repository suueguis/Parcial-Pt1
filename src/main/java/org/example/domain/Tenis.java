package org.example.domain;
import java.io.Serializable;

public class Tenis implements Serializable {
    private String marca;
    private String modelo;
    private double talla;
    private double precio;

    public Tenis(String marca, String modelo, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tenis{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", talla=" + talla +
                ", precio=" + precio +
                '}';
    }
}




