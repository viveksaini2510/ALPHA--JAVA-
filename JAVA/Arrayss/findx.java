import java.util.*;
public class findx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int x = sc.nextInt();
        for(int i=0; i<n ; i++){
            if(arr[i]==x){
                System.out.println(x +" is present at index "+i);
                return;
            }
            
        }
        

    }
}