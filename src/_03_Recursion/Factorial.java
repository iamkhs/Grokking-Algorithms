package _03_Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    private static int fact(int x){
        if (x == 1) return 1;
        return x * fact(x-1);
    }
}
