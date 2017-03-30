package com.jorgecaro;

/**
 * Created by Jorge Caro on 30/03/2017.
 */
public class Lavadoras extends Electrodomesticos {
    private double tipo_de_carga;
    private double velocidad_centrifugado;
    private boolean secadoras;

    //Constructores

    //Por defecto

    public Lavadoras(){

    }

    //Conveniencia

    public Lavadoras(double tipo_de_carga, double velocidad_centrifugado, boolean secadoras) {
        this.tipo_de_carga = tipo_de_carga;
        this.velocidad_centrifugado = velocidad_centrifugado;
        this.secadoras = secadoras;
    }

    public Lavadoras(String marca, String modelo, double precio_base, double consumo_electrico, double altura, double anchura, double metros, double tipo_de_carga, double velocidad_centrifugado, boolean secadoras) {
        super(marca, modelo, precio_base, consumo_electrico, altura, anchura, metros);
        this.tipo_de_carga = tipo_de_carga;
        this.velocidad_centrifugado = velocidad_centrifugado;
        this.secadoras = secadoras;
    }


    //Getter y Setter


    public double isTipo_de_carga() {
        return tipo_de_carga;
    }

    public void setTipo_de_carga(double tipo_de_carga) {
        this.tipo_de_carga = tipo_de_carga;
    }

    public double getVelocidad_centrifugado() {
        return velocidad_centrifugado;
    }

    public void setVelocidad_centrifugado(double velocidad_centrifugado) {
        this.velocidad_centrifugado = velocidad_centrifugado;
    }

    public boolean isSecadoras() {
        return secadoras;
    }

    public void setSecadoras(boolean secadoras) {
        this.secadoras = secadoras;
    }

    @Override
    public String toString() {
        return "Lavadoras -> {" +
                "tipo_de_carga= " + tipo_de_carga +" kg"+
                ", velocidad_centrifugado= " + velocidad_centrifugado +
                ", secadoras= " + secadoras +
                '}';
    }

    //Metodos

}
