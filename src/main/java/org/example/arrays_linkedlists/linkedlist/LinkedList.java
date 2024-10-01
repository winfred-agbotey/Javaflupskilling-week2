package org.example.arrays_linkedlists.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private byte size;

    public LinkedList() {
        this.size = 0;
    }

    /*Insert first element*/
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    /*Insert last element*/
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    /*Insert element at index*/
    public void insertAtIndex(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    /*Search for an element*/
    public void find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                System.out.println("value found: " + node.value);
                return;
            }
            node = node.next;
        }
        System.out.println("Value not found");
    }

    /*Delete first*/
    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    /*Delete by value*/
    public void deleteByValue(int value) {
        if (head == null) return;
        if (head.value == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            if (temp.next.value == value){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    /*Display all element*/
    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    @Override
    public String toString() {
        Node temp = head;
        StringBuilder results = new StringBuilder();
        while (temp != null) {
            results.append(temp.value).append(" ");
            temp = temp.next;
        }
        return results.toString();
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
