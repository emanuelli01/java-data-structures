package ArrayArrayLists.ex05;

/*
 * 5. Inversão de um Array
    Inverta a ordem dos elementos de um array. 
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

        InverteOrdem(nums);
    }

    private static void InverteOrdem(int[] nums) {
        int aux;
        
        for (int i = 0; i < nums.length / 2; i++) {
            aux = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = aux;
        }

        for (int num : nums){
            System.out.println(num);
        }
    }
}