package _04_QuickSort;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10,15,35,20,25};
        int max = findMax(arr, 0, 0);
        System.out.println(max);
    }

    private static int findMax(int[] arr, int index, int max){
        if (index == arr.length-1){
            return max;
        }

        if (arr[index] > arr[index+1]){
            max = arr[index];
        }

        return findMax(arr, index+1, max);
    }
}
