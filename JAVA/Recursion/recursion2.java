import java.util.*;
public class recursion2{

    public static void hanoi(int n , String source , String helper , String destination){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        hanoi(n-1, source, destination , helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
        hanoi(n-1, helper, source, destination);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("The total number of steps to transfer all disk from source to destination:");
        hanoi(n, "A", "B", "C");
        
    }

}