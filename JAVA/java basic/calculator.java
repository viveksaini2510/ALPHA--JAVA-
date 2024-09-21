import java.util.*;
public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Press 1 for addition. " );
        System.out.println("Press 2 for subtraction.");
        System.out.println("Press 3 for multiplication.");
        System.out.println("Press 4 for division.");
        System.out.println("Enter the number of operations :");
        int n = sc.nextInt();


        switch (n) {
            case 1: System.out.println(a+b);
                
                break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
        
            default: System.out.println("Please enter a valid number .");
        }
    }
    
}