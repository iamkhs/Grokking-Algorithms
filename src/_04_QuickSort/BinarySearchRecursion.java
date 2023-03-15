package _04_QuickSort;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr, 6,0,arr.length-1));
    }

    private static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start+(end -start) / 2;
        if (target == arr[mid]){
            return mid;
        }
        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);
    }
}
