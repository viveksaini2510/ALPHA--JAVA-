import java.util.*;
public class printsubarray {
    // public static void subarray(int arr[]){
    //     for(int i = 0; i<arr.length ; i++){
    //         int start = i;
    //         int array[] = new int [25];
    //         for (int j=i;j<arr.length; j++){
    //             int end = j ;
    //             for(int k=start; k<=end; k++){
    //               System.out.print(arr[k] + " ");
                                   
    //             }
    //             System.out.println();
    //         }
    //        System.out.println();
    //     }
        
    // }

     public static void maxsumofarray(int arr[]){
        int csum=0;
        int msum= Integer.MIN_VALUE;

        for(int i = 0; i<arr.length ; i++){
            int start = i;
            for (int j=i;j<arr.length; j++){
                int end = j ;
                csum=0;
                for(int k=start; k<=end; k++){
                  csum+=arr[k]; 
                                                
                }
                System.out.println(csum);  
                if(msum<csum){
                    msum=csum;
                }
            }
        }
        System.out.println("The maximum sum is :"+msum);
    }

    


    // public static int numberofsubarray(int arr[]){
    //     int n =0;
    //     for(int i = 0; i<arr.length ; i++){
    //         int start = i;
    //         for (int j=i;j<arr.length; j++){
    //             int end = j ;
    //             for(int k=start; k<=end; k++){                  
    //             }       
    //             n++;
    //         }           
    //     }
    //     return n;
    // }


    

    // public static void sumofarray(int arr[]){
    //     int sum=0;
    //     for(int i = 0; i<arr.length ; i++){
    //         sum=sum+i;
            
    //     }     
    // }

    // public static void sumofsubarray(int arr[]){
    //     int n = numberofsubarray(arr);
    //     int sum =0;
    //     for(int i = 1; i<=n; i++){
            // for(int j=0; j<; j++){
            //      sum = sum+j;
            //     System.out.println("the sum of subarray "+i+ "is : "+ sum);
            // }
    //     }

    // }
    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        maxsumofarray(arr);
    }
    
}
