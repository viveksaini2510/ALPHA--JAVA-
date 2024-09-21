import java.util.*;

public class recursion{
    public static int factorial(int n){
        int fact = 1;
        if(n==0){
            return 1;
        }
        fact = n*factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}