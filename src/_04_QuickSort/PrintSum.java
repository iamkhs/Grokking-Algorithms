package _04_QuickSort;

public class PrintSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sum(arr, 0, 0));
    }

    private static int sum(int[] arr, int i, int sum){
        if (i == arr.length){
            return sum;
        }

        sum+=arr[i];
        return sum(arr,i+1, sum);
    }
}
