import java.util.*;
public class linearSearch {

    public static int linersearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7,1,0,10,12,14};
        int key= 10;
        int index=linersearch(arr, key);
        if(index==-1){
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element is fouond at index:"+ index);
        }
    }
    
}
