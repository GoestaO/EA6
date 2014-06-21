/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ea6;

/**
 *
 * @author goesta
 */
public class Kettenbruch {

    private int[] werte;

    public int[] getWerte() {
        return werte;
    }

    public void setWerte(int[] werte) {
        this.werte = werte;
    }

    public Kettenbruch(int[] werte) {
        this.werte = werte;
    }

//    public double werteRekursivAus() {
//
//    }
    public double werteIterativAus() {

        if (werte.length > 0) {

            // Der Zwischenwert hat initial den letzten Wert im Werte-Array
            double zwischenwert = werte[werte.length - 1];

            // Schleife von "rechts" nach "links" durch das Werte-Array
            for (int i = werte.length - 2; i >= 0; i--) {
                zwischenwert = 1 / zwischenwert + werte[i];
            }
            return zwischenwert;
        }

        return 0;

    }

    private double werteRekursivAus(int n) {

        // zwischenwert in double-Variable wegspeichern
        double zwischenwert = 0;

        // Basisfall
        if (n <= 0) {
            return 0;
        }

        // Fall I
        if (n > 0) {
            zwischenwert = 1 / (werteRekursivAus(n - 1)) + werte[werte.length - n];
        }

        // Fall II
        if (n == 1) {
            zwischenwert = 1 / zwischenwert + werte[werte.length - 1];
        }
        return zwischenwert;
    }

    public double werteRekursivAus() {
        return werteRekursivAus(werte.length);

    }

    public static double approximiereWurzel2(int n) {

        Kettenbruch wurzelbruch = new Kettenbruch(Kettenbruch.berechneWurzel2Folge(n));

        return wurzelbruch.werteRekursivAus();

    }

    public static double approximiereE(int n) {
        Kettenbruch euler = new Kettenbruch(Kettenbruch.berechneEFolge(n));
        return euler.werteRekursivAus();
    }

    public static int[] berechneWurzel2Folge(int n) {

        int[] array = new int[n];
        array[0] = 1;
        for (int i = 1; i < n; i++) {
            array[i] = 2;
        }
        return array;
    }

    public static int[] berechneEFolge(int n) {

        int[] array = new int[n];
        int basiswert = 2;
        array[0] = 2;
        for (int i = 1; i < n; i++) {
            if ((i + 1) % 3 == 0) {
                array[i] = basiswert;
                basiswert = basiswert + 2;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

}
