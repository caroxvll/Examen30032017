package com.jorgecaro;

/**
 * Created by Jorge Caro on 30/03/2017.
 */
public class Frigorificos extends Electrodomesticos {
    private double capacidad_total;
    private double capacidad_congelador;

    // Constructores

    public Frigorificos(){

    }

    //Conveniencia

    public Frigorificos(double capacidad_total, double capacidad_congelador) {
        this.capacidad_total = capacidad_total;
        this.capacidad_congelador = capacidad_congelador;
    }

    public Frigorificos(String marca, String modelo, double precio_base, double consumo_electrico, double altura, double anchura, double metros, double capacidad_total, double capacidad_congelador) {
        super(marca, modelo, precio_base, consumo_electrico, altura, anchura, metros);
        this.capacidad_total = capacidad_total;
        this.capacidad_congelador = capacidad_congelador;
    }


    //Setter y Getter


    public double getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(double capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public double getCapacidad_congelador() {
        return capacidad_congelador;
    }

    public void setCapacidad_congelador(double capacidad_congelador) {
        this.capacidad_congelador = capacidad_congelador;
    }

    @Override
    public String toString() {
        return "Frigorificos{" +
                "capacidad_total=" + capacidad_total +
                ", capacidad_congelador=" + capacidad_congelador +
                '}';
    }
}
