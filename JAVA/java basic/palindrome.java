import java.util.*;
public class palindrome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int num =n;
    int rev =0 ;
    int a =0;
    while(n>0){
         a=n%10;
        rev = rev *10 + a;
        n=n/10;
    }
    if(rev==num){
        System.out.println("the given number "+ num + " is palindrome.");
    }
    else{
        System.out.println("the given number "+ num + "is not palindrome.");

    }   
}
}
