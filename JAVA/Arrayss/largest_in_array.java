import java.util.*;
public class largest_in_array {

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
                index= i;
            }
        }
        System.out.println("largest element is present at index :" + index);
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {1,25,3,45,85,12,36,96,45,12,20};
        int lar = largest(arr);

        System.out.println("largest element is : " + lar);
    }
}
