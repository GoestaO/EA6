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
public class Power {

    public double powerRekursiv(int p, int n) {
        if (n < 0) {
            if (p == 0) {
                throw new IllegalArgumentException("Negative Werte sind nicht erlaubt.");
            }
            return (1.0 / powerRekursiv(p, -n));
        }
        if (n == 0) {
            return 1;
        } else {
            return powerRekursiv(p, n - 1) * p;
        }
    }

}
