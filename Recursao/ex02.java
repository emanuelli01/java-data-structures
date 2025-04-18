package Recursao;

/*
* 2. Calcular o n-ésimo Termo da Sequência de Fibonacci
    Enunciado: Implemente uma função recursiva para calcular o n-ésimo termo da sequência de Fibonacci
*/


public class ex02 {
    public static void main(String[] args) {
        int num = 5;
    
        int r = Fibonacci(num);
        System.out.println(r);
    }

    private static int Fibonacci(int num) {
        if(num == 1) {
            return 0;
        } else if (num ==2){
            return 1;
        } else {
            return Fibonacci(num-1) + Fibonacci(num-2);
        }

        
    }
}
