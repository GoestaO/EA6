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
public class Fakultaet {

    public int getFakultaetIterativ(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative Werte sind nicht erlaubt!");
        }
        int faculty = 1;
        if (n > 0) {
            faculty = 1;
            for (int i = 1; i <= n; i++) {
                faculty *= i;
            }
        }
        return faculty;
    }

    public int getFakultaetRekursiv(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative Werte sind nicht erlaubt!");
        }
        if (n == 0) {
            return 1;
        }
        return getFakultaetRekursiv(n - 1) * n;
    }
}
