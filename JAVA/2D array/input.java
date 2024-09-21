import java.util.*;
public class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][]= new int[2][5];
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The array is :");
        for(int i = 0; i<2 ;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number to be searched:");
        int x = sc.nextInt();
        for(int i = 0; i<2 ;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j]==x){
                    System.out.println("x is located at index "+ i+","+j);
                }
            }
        }
    }
}