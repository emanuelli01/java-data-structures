package Stack;

import java.util.Stack;

/*
 * 1. Inverter uma String usando Pilha
    Problema: Dada uma string, use uma pilha para inverter sua ordem.  
 */

public class InverteString {
    public static void main(String[] args) { 
        Stack<Character> stack = new Stack<>();
        String s = "carro";
        StringBuilder inversa = new StringBuilder();

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            inversa.append(stack.pop());
        }

        System.out.println(s);
        System.out.println(inversa.toString());
    }
}
