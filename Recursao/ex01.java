package Recursao;

/*
 * 1. Calcular o Fatorial de um Número
    Enunciado: Implemente uma função recursiva para calcular o fatorial de um número n, onde n!=n×(n−1)!
 */

public class ex01 {
    public static void main(String[] args) {
        int num = 3;

        int r = Fatorial(num);

        System.out.println(r);
    }

    private static int Fatorial(int num) {
        int size = num-1;
        
        if(size > 0) {
            num *= Fatorial(size);
        }
        return num;
    }
}
