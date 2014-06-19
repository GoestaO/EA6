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

            // Der Zwischenwerte hat initial den letzten Wert im Werte-Array
            double zwischenwert = werte[werte.length - 1];

            // Schleife von "rechts" nach "links" durch das Werte-Array
            for (int i = werte.length - 2; i >= 0; i--) {
                zwischenwert = 1 / zwischenwert + werte[i];
            }
            return zwischenwert;
        }

        return 0;

    }

//    public static double approximiereWurzel2(int n) {
//
//    }
//
//    public static double approximiereE(int n) {
//
//    }
//
//    public static int[] berechneWurzel2Folge(int n) {
//
//    }
//
//    public static int[] berechneEFolge(int n) {
//
//    }
    // hier ist Platz für Hilfsmethoden
}
