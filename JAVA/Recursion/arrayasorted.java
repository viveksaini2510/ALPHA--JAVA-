import java.util.*;
public class arrayasorted {

    public static boolean sort(int arr[],int idx){
        if(idx ==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
          return  sort(arr, idx+1);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter values:");
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(sort(arr , 0));
    }
}
