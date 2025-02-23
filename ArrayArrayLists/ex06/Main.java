package ArrayArrayLists.ex06;

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
        System.out.println("Digite o número que voce quer remover:");

        int x;
        x= in.nextInt();
        System.out.println(x + " selecionado!");

        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == x){
                System.out.println( nums.get(i) + " removido com sucesso! Index: " + i);
                nums.remove(i);
            }
        }

        System.out.println(nums);
    }
}
