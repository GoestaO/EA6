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
public class Rekursion {

    public int a(int x, int y) {
        
        if (x <= 0 || y < 0) {
            return x - y + 2;
        }
        if (x % 2 == 0) {
            return a(x / 2, y) + a(x, y - 1);
        }
        return a(x - 1, y - 2);
    }
}
