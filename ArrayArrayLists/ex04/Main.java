/*
 * 4. Ordenação de um Array
    Ordene um array de inteiros de forma crescente.  
 */

 public class Main {
    public static void main(String[] args){
        int[] nums = {5, 10, 3, 20, 4};

        OrdenaArray(nums);
    }

    private static void OrdenaArray(int[] nums){
        int aux;
        boolean troca = true;

        while (troca) {
            troca = false; 
            for (int i = 0; i < nums.length-1; i++){
                if (nums[i] > nums[i+1]){
                    aux = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = aux;
                    troca = true;
                }
            }
        }
        for (int num : nums){
            System.out.println(num);
        }
    }
}
