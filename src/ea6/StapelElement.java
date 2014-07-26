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
public class StapelElement {

    private String entry;
    
    // Referenz auf das Nachbar-Element
    private StapelElement next;

    /**
     * Konstruktor
     * @param entry
     * @param next 
     */
    public StapelElement(String entry, StapelElement next) {
        this.entry = entry;
        this.next = next;
    }

    /**
     * Konstruktor, wenn es kein Folge-Element gibt
     * @param entry 
     */    
    public StapelElement(String entry) {
        this(entry, null);
    }

    // Getter und Setter
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public StapelElement getNext() {
        return next;
    }

    public void setNext(StapelElement next) {
        this.next = next;
    }

}
