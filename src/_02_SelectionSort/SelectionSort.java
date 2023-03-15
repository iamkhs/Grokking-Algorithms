package _02_SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr){
        for (int i = 0; i<arr.length-1; i++){
            int min = i;
            for (int j = i+1; j< arr.length; j++){
                if (arr[j] < arr[i]){
                    min = j;
                }
            }

            if (min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        return arr;
    }
}
