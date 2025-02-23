package ArrayArrayLists.ex12;

import java.util.ArrayList;

/*
 * 12. Reverter um ArrayList
      Inverta a ordem dos elementos de um `ArrayList`.
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(4);
        nums.add(1);
        
        InverteOrdem(nums);
    }

    private static void InverteOrdem(ArrayList<Integer> nums) {
        int val1, val2;
        for (int i = 0; i < nums.size() / 2; i++) {
            val1 = nums.get(i);
            val2 = nums.get(nums.size() - i - 1);
            nums.set(i, val1);
            nums.set(nums.size() - i - 1, val2);    
        }
        System.out.println(nums);
    }
}