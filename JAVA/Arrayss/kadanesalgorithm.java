import java.util.*;
public class kadanesalgorithm {
    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            cs+=arr[i];
            ms=Math.max(ms, cs);
        }
        System.out.println("The max sum of subarray is : "+ms);
    }

    public static void main(String[] args) {
        int arr[] = {-5,-4,-6};
        kadanes(arr);
    }
    
}
