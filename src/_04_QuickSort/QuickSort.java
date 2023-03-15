package _04_QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end){
        if (start > end){
            return;
        }

        int mid = start +(end - start)/ 2;
        int pivot = arr[mid];
        int low = start;
        int high = end;

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }

            while(arr[end] > pivot){
                end--;
            }

            if (start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
