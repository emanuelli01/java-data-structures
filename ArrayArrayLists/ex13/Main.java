package ArrayArrayLists.ex13;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 13. Filtrar Números Pares de um ArrayList
      Filtre apenas os números pares de um `ArrayList`. 
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(3);
        nums.add(15);   
        nums.add(13);  

        FiltraPar(nums);
    }

    private static void FiltraPar(ArrayList<Integer> nums) {
        System.out.println("Antes: " + nums);
        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()) {
            if (it.next() % 2 != 0) it.remove();
        }
        System.out.println("Depois: " + nums);
    }
}
