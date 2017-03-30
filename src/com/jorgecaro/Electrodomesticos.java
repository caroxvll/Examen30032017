package com.jorgecaro;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * Created by Jorge Caro on 30/03/2017.
 */
public class Electrodomesticos {
    private String marca;
    private String modelo;
    private double precio_base;
    private double consumo_electrico;
    private double altura;
    private double anchura;
    private double metros;


    //Constructores

    //Por defecto

    public Electrodomesticos() {

    }

    //Conveniencia


    public Electrodomesticos(String marca, String modelo, double precio_base, double consumo_electrico, double altura, double anchura, double metros) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio_base = precio_base;
        this.consumo_electrico = consumo_electrico;
        this.altura = altura;
        this.anchura = anchura;
        this.metros = metros;
    }

    //Getter y Setter


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

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public double getConsumo_electrico() {
        return consumo_electrico;
    }

    public void setConsumo_electrico(double consumo_electrico) {
        this.consumo_electrico = consumo_electrico;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Electrodomesticos -> {" +
                "marca= '" + marca + '\'' +
                ", modelo= '" + modelo + '\'' +
                ", precio_base= " + precio_base + " euros" +
                ", consumo_electrico= " + consumo_electrico +
                ", altura= " + altura + " m" +
                ", anchura= " + anchura + " m" +
                ", metros= " + metros + " m" +
                '}';
    }

    //Metodos


/*
    public void precioBruto(int letra) {
        if (letra == 'A') {
            precio_base += 100;
        } else if (letra == 'B') {
            precio_base += 80;
        } else if (letra == 'C') {
            precio_base += 60;
        } else if (letra == 'D') {
            precio_base += 50;
        } else if (letra == 'E') {
            precio_base += 30;
        } else {
            precio_base += 10;
        }
    }
    */
    public void precioTransporte() {
        int tamaño = 30;
        if (tamaño > 0 && tamaño <20) {
            precio_base +=10;
        } else if (tamaño > 20 && tamaño < 50) {
            precio_base +=50;
        } else if (tamaño >50 && tamaño <80){
            precio_base +=80;
        }else {
            precio_base +=100;
        }
    }
}
