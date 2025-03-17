package Listas;

class Nodo {
    int value;
    Nodo proximo;

    Nodo (int value) {
        this.value = value;
        this.proximo = null;
    } 
}

class LinkedList {
    public Nodo head;

    LinkedList() {
        this.head = null;
    }

    void insert(int value) {
        Nodo newNodo = new Nodo(value);

        if (head == null) {
            head = newNodo;
            return;
        }

        Nodo temp = head;
        while (temp.proximo != null) {
            temp = temp.proximo;
        }
        temp.proximo = newNodo;

    }

    void print() {
        Nodo aux = head;
        while (aux != null) {
            System.out.print(aux.value + " -> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }
}

public class ListaEncadeada {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.insert(10);
        lista.insert(20);
        lista.insert(30);
        lista.insert(40);
        lista.print();
        
    }
}
