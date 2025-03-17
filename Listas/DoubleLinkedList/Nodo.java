package Listas.DoubleLinkedList;

public class Nodo {
    public int value;
    public Nodo proximo, anterior;

    Nodo(int value) {
        this.value = value;
        this.proximo = null;
        this.anterior = null;
    }
}
