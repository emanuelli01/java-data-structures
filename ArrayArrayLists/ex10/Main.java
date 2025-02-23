package ArrayArrayLists.ex10;

/*
 * 10. Multiplicar Elementos de um Array
      Multiplique todos os elementos de um array por um fator. 
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 4, 6};

        Multiplica(nums);
    }

    private static void Multiplica(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        for (int val : nums){
            System.out.println(val);
        }
    }
}
