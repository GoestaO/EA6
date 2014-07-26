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
public class LinkedList {

    private ListNode head;

    public LinkedList() {
        this.head = null;
    }

    public ListNode getHead() {
        return head;
    }

//    public void setHead(ListNode head) {
//        this.head = head;
//    }
    public void add(int value) {
        ListNode newNode = new ListNode(value, this.head);
        this.head = newNode;
    }

//    public int size() {
//        
//        ListNode current = this.head;
//        int count = 0;
//        while (current != null) {
//            count++;
//            current = current.getNext();
//        }
//        return count;
//    }
    public int size() {
        return size(this.head);
    }

    private int size(ListNode node) {
        if (node == null) {
            return 0;
        }
        return size(node.getNext()) + 1;
    }

    public int sum() {
        return sum(this.head);
    }

    private int sum(ListNode node) {
        if (node == null) {
            return 0;
        }
        return sum(node.getNext()) + node.getEntry();
    }

    public boolean contains(int entry) {
        ListNode current = this.head;
        while (current != null) {
            if (entry == current.getEntry()) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

}
