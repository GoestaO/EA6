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
public class ListNode {

    private int entry;
    private ListNode next;

    public ListNode(int entry, ListNode next) {
        this.entry = entry;
        this.next = next;
    }

    public ListNode(int entry) {
        this(entry, null);
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}
