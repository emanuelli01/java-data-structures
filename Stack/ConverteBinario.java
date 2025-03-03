package Stack;

import java.util.Stack;

public class ConverteBinario {
    public static String Transforma(Integer num) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binario = new StringBuilder();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        while (!stack.isEmpty()) {
            binario.append(stack.pop());
        }
        return binario.toString();
    }
    public static void main(String[] args) {
        System.out.println("Número 1 -> " + Transforma(1));
        System.out.println("Número 2 -> " + Transforma(2));
        System.out.println("Número 3 -> " + Transforma(3));
    }
}
