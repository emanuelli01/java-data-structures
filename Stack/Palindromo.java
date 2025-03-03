package Stack;

import java.util.Stack;

/*
 * 5. Verificar se uma Pilha é Palíndromo
    Problema: Determine se uma string é um palíndromo usando uma pilha. 
 */

public class Palindromo {
    public static void main(String[] args) {
        String palindromo = "anotaram a data da maratona";
        Stack<Character> stack = new Stack<>(); 

        System.out.println(palindromo);

        String remove = palindromo.replaceAll("\\s+", "");
        for (char c : remove.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < remove.length(); i++) {
            if (remove.charAt(i) != stack.pop()) {
                System.out.println("NAO É PALINDROME");
                return;
            }
        }
        System.out.println("É PALDINND");
    }
}
