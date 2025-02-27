package Stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inverter {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(fila);
        Inverte(fila);
        System.out.println(fila);
    }
    private static void Inverte(Queue<Integer> fila) {
        Stack<Integer> stack = new Stack<>();
                    
        while (!fila.isEmpty()) {
            stack.push(fila.poll());
        }
        while (!stack.isEmpty()) {
            fila.add(stack.pop());
        }                
    }
}
