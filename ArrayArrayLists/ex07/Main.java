package ArrayArrayLists.ex07;

import java.util.*;

/*
 * 6. Remover Elemento de um ArrayList
    Remova um número específico de um `ArrayList`. 
 */

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(5);
        nums.add(2);

        System.out.println(nums);
        System.out.println("Digite o número que voce quer conferir:");
        int aux = 0;
        int x;
        x = in.nextInt();

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == x){
                aux = x;
                System.out.println( x + " existe no array! Index: " + i);
            }
        }
        if (aux == 0){
            System.out.println("Não esta no array");
        }

    }
}
