package Listas.opateste;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.print();
        System.out.println("Removed -> " + list.remove(40));
        list.print();
    }    
}
