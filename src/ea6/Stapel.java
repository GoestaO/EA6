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
public class Stapel {

    private StapelElement head;

    public Stapel() {
        this.head = null;
    }

    /**
     * Fügt dem Stapel den String s hinzu
     *
     * @param s
     */
    public void fuegeElementHinzu(String s) {
        StapelElement neuesElement = new StapelElement(s, this.head);
        this.head = neuesElement;
    }

    /**
     * Entfernt den zuletzt hinzugefügten String und liefert diesen zurück
     *
     * @return
     */
    public String entferneOberstesElement() {
        if (this.head == null) {
            return null;
        }

        StapelElement zuLoeschend = this.head;

        // Den Stapelkopf um ein Element nach "unten" verschieben
        this.head = zuLoeschend.getNext();

        // Den zu löschenden String (Eintrag des Stapelelements) ausgeben
        return zuLoeschend.getEntry();
    }

    /**
     * Liefert den zuletzt hinzugefügten String zurück
     *
     * @return
     */
    public String liefereOberstesElement() {
        if (this.head == null) {
            return null;
        }

        StapelElement kopf = this.head;
        return kopf.getEntry();
    }

    /**
     * Liefert true zurück, wenn der Stapel keine Elemente enthält, ansonsten
     * false
     *
     * @return
     */
    public boolean istLeer() {
        return this.head == null;
    }

    /**
     * Liefert die Anzahl der gespeicherten Elemente zurück
     *
     * @return
     */
    public long liefereGroesse() {

        return liefereGroesse(this.head);
    }

    private int liefereGroesse(StapelElement stapelElement) {
        
        // erster Basisfall: Stapel ist leer, alternativ könnte die istLeer()-Methode verwendet werden  
        if (this.head == null) {
            return 0;
        }

        // zweiter Basisfall: Nur ein Element im Stapel -> es gibt kein Folgeelement
        if (stapelElement.getNext() == null) {
            return 1;
        }
        return liefereGroesse(stapelElement.getNext()) + 1;

    }
}
