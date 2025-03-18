package Listas.opateste;

class DoubleLinkedList {
    public Node head, tail;

    DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
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

    public int remove(int value) {
        Node aux = head;

        if (aux.value == value) {
            head = aux.next;
            return value;
        }

        while(aux.next != null && aux.value != value) {
            aux = aux.next;
        }

        if (aux.value == value && aux.next != null) {
            aux.next.prev = aux.prev;
            aux.prev.next = aux.next;
            return value;
        }

        if (aux == tail) {
            tail = aux.prev;
            tail.next = null;
            return value;
        }
        return -1;
    }
}
