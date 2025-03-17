package Listas.DoubleLinkedList;

public class Linkedlist {
    public Nodo head, tail;

    Linkedlist() {
        this.head = null;
        this.tail = null;
    }

    void insert(int value) {
        Nodo newNodo = new Nodo(value);

        if (head == null) {
            head = newNodo;
            tail = newNodo;
            return;
        }

        newNodo.anterior = tail;
        tail.proximo = newNodo;
        tail = newNodo;
    }

    void print() {
        Nodo aux = head;
        while (aux != null) {
            System.out.print(aux.value + " <--> ");
            aux = aux.proximo;
        }
        System.out.println("null");
    }

    int remove(int value) {
        Nodo aux = head;

        if (aux.value == value) {
            head = aux.proximo;
            return value;
        }

        while(aux != null && aux.value != value) {
            aux = aux.proximo;
        }

        if (aux == null) {
            System.out.println("Não existe na lista");
            return -1;
        }

        if (aux.value == value && aux.proximo != null) {
            aux.proximo.anterior = aux.anterior;
            aux.anterior.proximo = aux.proximo;
            return value;
        }

        if (aux.value == value) {
            tail = aux.anterior;
            tail.proximo = null;
            return value;
        }

        return -1;
    }
}
