package ArrayArrayLists.ex11;

import java.util.Arrays;

/*
 * 11. Somar Dois Arrays Elemento por Elemento
      Some dois arrays elemento por elemento e armazene em um terceiro array.  
 */

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15};
        int[] arr2 = {20, 30, 40};
        
        SomaArrays(arr1, arr2);

        int[] arr3 = SomaArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    private static int[] SomaArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }
}
