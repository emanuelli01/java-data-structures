package ArrayArrayLists.ex01;

public class Main {
    public static void main (String[] args){
        int[] nums = {10, 20, 30};

        SomaElementos(nums);
    }

    private static void SomaElementos(int[] nums) {
        int soma = 0;

        for (int val : nums) {
            soma += val;
        }
        System.out.println("Soma: " + soma);
    }
}