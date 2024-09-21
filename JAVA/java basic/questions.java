import java.util.*;
public class questions {

    public static float average(int a,int b,int c){
        float average = (a+b+c)/3;
        return average;
    }

    // print sum of all odd natural number form 1 to n

    public static int printOddSum(int n){
        int sum=0;
        for(int i=1; i<=n; i+=2){
            sum = sum+i;
        }
        return sum;

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. enter 3 numbers from the user & make a function to print the average.

        // System.out.println("Enter three numbers :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("The average of the above number is " + average(a,b,c));

        // System.out.println("Enter the number :");
        // int n = sc.nextInt();
        // System.out.println("The sum of odd number till "+ n +" is ");
        // System.out.println(printOddSum(n));

        int zeros =0;
        int positive =0;
        int negative=0;
        System.out.println("Enter 1 for start and 0 for stop");
        int n = sc.nextInt();
        while (n==1) {
            System.out.println("Enter your number:");
            int a = sc.nextInt();  
            if(a>0){
                positive++;
            }       
            else if(a<0){
                negative++;
            }
            else{
                zeros++;
            }
            System.out.println("Please enter 1 to continue and 0 to stop: ");
            n = sc.nextInt();
        }
        
        System.out.println("The number of 0 in these numbers : " + zeros );
        
        System.out.println("The number of positive numbers in these numbers : "+positive);
        
        System.out.println("The number of negative numbers in these numbers : "+ negative);
        


    }
}
