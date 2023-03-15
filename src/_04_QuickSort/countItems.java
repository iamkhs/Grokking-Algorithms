package _04_QuickSort;

public class countItems {
    public static void main(String[] args) {
        String[] arr = {"Shanto","Rohit","Rahul","Asif","Shuvo","Jony","Tuhin"};

        var count = count(arr, 0,0);
        System.out.println(count);
    }

    private static int count(String[]arr, int count, int index){
        if (index == arr.length){
            return count;
        }
        count++;
        return count(arr, count, index+1);
    }
}
