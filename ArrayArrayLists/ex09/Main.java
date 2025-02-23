package ArrayArrayLists.ex09;
/*
 * 9. Remover Duplicatas de um ArrayList
    Remova elementos duplicados de um `ArrayList`.  
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(10);
        nums.add(10);
        nums.add(5);
        nums.add(5);
        nums.add(5);
        nums.add(10);
        nums.add(4);

        Duplicados(nums);
    }

    private static void Duplicados(ArrayList<Integer> nums) {
        System.out.println(nums + "\n");
       
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j)) nums.remove(j);
            }
        }
        
        System.out.println(nums);
    }
}
