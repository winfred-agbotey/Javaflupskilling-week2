package org.example.arrays_linkedlists.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.find(10);
        list.insertAtIndex(40,3);
        list.deleteFirst();
        list.deleteByValue(20);
        list.displayList();

    }
}
