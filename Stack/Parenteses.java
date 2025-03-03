package Stack;
/*
 * 2. Verificar Expressão com Parênteses Balanceados
    Problema: Verifique se os parênteses em uma expressão matemática estão corretamente balanceados.  
 */

import java.util.Stack;

public class Parenteses {
    public static boolean VerificaAbertura(String expressao) {
        Stack<Character> stack = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if ( c == '(' ) {
                stack.push(c);
            } else if ( c == ')' ) {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String exp1 = "(1 + 2) * (3 / 4)";  // ✅
        String exp2 = "(1 + 2 * (3 / 4)";   // ❌ 
        String exp3 = "((1 + 2) * 3)";      // ✅ 
        String exp4 = "((1 + 2) * 3))"; 

        System.out.println(exp1 + " -> " + VerificaAbertura(exp1));
        System.out.println(exp2 + " -> " + VerificaAbertura(exp2));
        System.out.println(exp3 + " -> " + VerificaAbertura(exp3));
        System.out.println(exp4 + " -> " + VerificaAbertura(exp4));
    }
}

