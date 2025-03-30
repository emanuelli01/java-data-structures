package DoubleLinkedList.ex01;
// ex01
public class DoubleLinkedList {
    public Node head, tail = null;

    public void insert(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void remove(int value) {
        Node aux = head;

        if(aux.value == value) {
            head = aux.next;
            return;
        }

        while(aux != null && aux.value != value) {
            aux = aux.next;
        }

        if(aux == null) {
            System.out.println("Valor inexistente na lista");
            return;
        }

        if(aux.value == value && aux.next != null) {
            aux.next.prev = aux.prev;
            aux.prev.next = aux.next;
            return;
        }

        if(aux == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        
        return;
    }
    public void print() {
        Node aux = head;

        while(aux != null) {
            System.out.print(aux.value + " ");
            aux = aux.next;
        }
        System.out.println("null");
    } 


    // ex02

    public void printInverso() {
        Node aux = tail;

        while(aux != null) {
            System.out.print(aux.value + " ");
            aux = aux.prev;
        }
        System.out.println("null");
    }

    // ex03

    public int count() {
        Node aux = head;
        int i = 0;

        while(aux != null) {
            aux = aux.next;
            i += 1;
        }
        return i;
    }

    // ex04

    public void insertIn(int value, int where) {
        Node newNode = new Node(value);
        Node aux = head;

        if(aux.value == where) {
            aux.prev = newNode;
            newNode.next = aux;
            head = newNode;
            return;
        } 

        while(aux != null && aux.value != where ) {
            aux = aux.next;
        }

        if(aux == null) {
            System.out.println("local invalido");
            return;
        }

        if(aux.value == where && aux.next != null) {
            newNode.prev = aux.prev;
            newNode.next = aux;
            aux.prev.next = newNode;
            aux.prev = newNode;
            return;
        }

        if(aux == tail && aux.value == where) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }     
    }

    // ex 05

    public void removeIn(int location) {
        if(location == 0) {
            head = head.next;
            head.prev = null;
            return;
        }
        if(location == 1) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
    }
}
