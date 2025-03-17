package Listas.LInkedLIst;

public class Main {
    public static void main(String[] args) {
        Linkedlist lista = new Linkedlist();

        lista.insert(40);
        lista.insert(30);
        lista.insert(20);
        lista.insert(10);
        lista.print();
        System.out.println("valor removido -> " + lista.remove(30));
        lista.print();
    }
}
