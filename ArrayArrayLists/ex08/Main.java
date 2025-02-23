package ArrayArrayLists.ex08;

/*
 * 8. Contar Ocorrências de um Número
    Conte quantas vezes um número aparece em um array.  
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(9);
        nums.add(13);
        nums.add(27);
        nums.add(5);
        nums.add(5);

        QtdOcorrencia(nums);
    }    
    
    private static void QtdOcorrencia(ArrayList<Integer> nums) {
        int contagem = 0;
        int target = 27;
        for (int num : nums){
            if (num == target){
                contagem++;
            }
        }
        System.out.println(contagem);

    }
}
