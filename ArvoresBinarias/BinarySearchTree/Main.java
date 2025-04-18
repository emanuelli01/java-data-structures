package ArvoresBinarias.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree lista = new BinaryTree();

        int[] nums = {30, 80, 20, 10};
        for (int num : nums) {
            lista.insert(num);
        }

        System.out.println(lista);
        System.out.println("### ARVORE ORIGINAL ###");
        lista.print();
        lista.search(50);

        
    }
}
