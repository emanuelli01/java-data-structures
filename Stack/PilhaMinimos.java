package Stack;

import java.util.Stack;

class Minimos {
    private Stack<Integer> stack;
    private Stack<Integer> stackMinimos;

    public Minimos() {
        stack = new Stack<>();
        stackMinimos = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);

        if (stackMinimos.isEmpty() || value <= stackMinimos.peek()) {
            stackMinimos.push(value);
        }
    }

    public void pop() {
        if (stack.peek() == stackMinimos.peek()) { 
            stackMinimos.pop();
        }
        stack.pop();
    }

    public void print() {
        System.out.println(stack + " <- PILHA");
        System.out.println(stackMinimos + " <- MINIMOS");
    }
}

public class PilhaMinimos {
    public static void main(String[] args) {
        Minimos lista = new Minimos();
        lista.push(10);
        lista.push(20);
        lista.pop();
        lista.push(5);
        lista.push(6);
        lista.push(30);
        lista.print();
    }
}
