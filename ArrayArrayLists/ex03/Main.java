/*
 * 3. Maior e Menor Elemento de um Array
    Encontre o maior e o menor número dentro de um array. 
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(57);
        nums.add(6);
        nums.add(5);
        nums.add(3);
        nums.add(1);

        MaiorMenor(nums);
    }

    private static void MaiorMenor(ArrayList<Integer> nums){
        int maior = 0;
        int menor = nums.get(0);

        for (int num : nums){
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    } 
}
    