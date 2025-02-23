package ArrayArrayLists.ex02;

/*
 * 2. Média dos Valores de um ArrayList
    Dado um `ArrayList` de números, calcule a média dos valores
 */

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        Media(nums);
    }

    private static void Media(ArrayList<Integer> nums){
        int total = 0, media = 0;

        for (int i : nums){
            total += i;
        }
        media = total / nums.size();

        System.out.println("Media: " + media);
    }

} 