package Stack;

/*
 * 6. Implementar Pilha Encadeada
 */

class Node {
    int value;
    Node proximo;

    Node(int value) {
        this.value = value;
        this.proximo = null;
    }
}

class PilhaE {
    private Node head;
    public PilhaE() {
        this.head = null;
    }

    public void push(int value) {
        Node nodo = new Node(value);
        nodo.proximo = head;
        head = nodo;
    }

    public void print() {
        Node aux = head;
        while (aux != null) {
            System.out.print(aux.value + " -> ");
            aux = aux.proximo;
        }
    }

    public int pop() {
        int value = head.value;
        head = head.proximo;
        return value;
    }

    public int peek() {
        return head.value;
    }
}

public class PilhaEncadeada {
    public static void main(String[] args) {
        PilhaE lista = new PilhaE();

        lista.push(10);
        lista.push(20);
        lista.push(30);

        lista.print();
        System.out.println("\nElemento removido: " + lista.pop());
        System.out.println("Topo da lista: " + lista.peek());
        lista.print();
    }
}
