package _03_Recursion;

public class Recursion {
    public static void main(String[] args) {
        countDown(5);
    }

    private static void countDown(int i){
        if (i == 0){
            return;
        }

        System.out.println(i);
        countDown(i-1);
    }
}
