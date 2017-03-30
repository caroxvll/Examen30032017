package com.jorgecaro;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {

        Electrodomesticos e = new Electrodomesticos("Fuji", "Fral", 100, 6.4, 1, 2, 3);

        Lavadoras l = new Lavadoras(6.4, 13.2, true);

        Frigorificos f = new Frigorificos(23, 10);

        System.out.println(e);
        System.out.println(l);
        System.out.println(f);

    }
}
