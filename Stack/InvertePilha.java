package Stack;

import java.util.Arrays;
/*
 * 4. Reverter uma Pilha
    Problema: Escreva uma função para inverter os elementos de uma pilha. 
 */
import java.util.Stack;

public class InvertePilha {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1, 2, 3, 4, 5));

        Inverte(stack);
    }
        
    private static void Inverte(Stack<Integer> stack) {
        Stack<Integer> invertido = new Stack<>();
        System.out.println(stack);

        while (!stack.empty()) {
            invertido.push(stack.pop());
        }
        System.out.println(invertido);
    }
}
