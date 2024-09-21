import java.util.*;

public class javabasic{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    System.out.println("Enter n: ");
    //    int n = sc.nextInt();
    // int sum =0;
    // int i=1;
    // while(i<=n){
    //     sum = sum +i;
    //     i++;
    // }
    // System.out.println("sum of "+n+ " is "+ sum +".");

        // System.out.println("Enter number :");
        // int n = sc.nextInt();
        // int rev=0;
        // int a;
        // while(n!=0){
        //     a=n%10;
        //     n=n/10;
        //     rev= rev*10 +a;

        // }
        // System.out.println("reverse number is : "+ rev);


        // System.out.println("Enter number :");
        // int n = sc.nextInt();
        // int sum=0;
        // int a;
        // while(n!=0){
        //     a=n%10;
        //     n=n/10;
        //     sum = sum +a;

        // }
        // System.out.println("sum of  number is : "+ sum);

        // System.out.println("Enter number :");
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i=1; i<=n; i++){
        //     if(n%i==0){
        //         count++;
        //     }          
        // }
        // if (count == 2){
        //         System.out.println("The number "+ n+ " is prime number.");
        //     }
        //     else {
        //         System.out.println("The number "+n+ " is non-prime .");
        //     }

        System.out.println("Enter number :");
        int n = sc.nextInt();
        int count =0;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
               count ++;
            }
        }
        if (count == 0){
             System.out.println("the number is prime .");
        }
        else{
            System.out.println("the number is not prime.");
        }
    }
}