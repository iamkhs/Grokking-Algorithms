package _01_BinarySerach;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int ans = binaryS(arr, 7);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/ 2;
            if (arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    private static int binaryS(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            int guess = arr[mid];

            if (guess == target){
                return mid;
            }

            if (guess > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
}
