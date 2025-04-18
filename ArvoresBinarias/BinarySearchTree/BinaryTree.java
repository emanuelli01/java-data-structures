package ArvoresBinarias.BinarySearchTree;

public class BinaryTree {
    public Node root = null;

    public void insert(int value) {
        this.root = insertValue(root, value);
    }

    public Node insertValue(Node root, int value) {
        if(root == null) {
            return new Node(value);
        }

        if(value < root.value) {
            root.left = insertValue(root.left, value);
        }

        if(value > root.value) {
            root.right = insertValue(root.right, value);
        }
        return root;
    }

    public void print() {
        printInOrder(this.root);
        System.out.println();
    }

    private void printInOrder(Node root) {
        if(root == null) return;
        
        printInOrder(root.left);
        System.out.println(root.value);
        printInOrder(root.right);
    }

    public String search(int value) {
        boolean result = searchNode(root, value);
        if(result) return "existe";
        else return "n existe";
    }

    private boolean searchNode(Node root, int value) {
        if(root == null) return false;

        if(root.value == value) return true;

        if(value < root.value) return searchNode(root.left, value);
        else return searchNode(root.right, value);
    }

}
