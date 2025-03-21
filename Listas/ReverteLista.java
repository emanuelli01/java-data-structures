package Listas;

/*
 * Implemente um método para reverter uma lista encadeada
 */

class Node {
    int value;
    Node next; 
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head, tail;

    LinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
        
    }

    public void print() {
        Node aux = head;
        
        while(aux != null) {
            System.out.print(aux.value + " -> ");
            aux = aux.next;
        }
        System.out.println("null");
    }

    void inverte() {
        Node corrente = head, prev = null, next = null;

        while (corrente != null) {
            next = corrente.next;
            corrente.next = prev;
            prev = corrente;
            corrente = next;
        }
        tail = head;
        head = prev;
    }

    public void total() {
        Node aux = head;
        int i = 0;
        while(aux != null) {
            aux = aux.next;
            i += 1;
        }
        System.out.println(i + " elements.");
    }
}


public class ReverteLista {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);

        list.insert(30);
        list.insert(40);
        list.print();
        list.total();
        list.inverte();
        list.print();
    }
}
