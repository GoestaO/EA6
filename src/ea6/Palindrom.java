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
public class Palindrom {

    public boolean istPalindromIterativ(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String reverseString = sb.toString();
        return s.toLowerCase().equals(reverseString.toLowerCase());
    }

    public boolean istPalindromRekursiv(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            if (s.toLowerCase().charAt(0) != s.toLowerCase().charAt(s.length() - 1)) {
                return false;
            }
            return istPalindromRekursiv(s.toLowerCase().substring(1, s.length() - 1));
        }
    }

}
