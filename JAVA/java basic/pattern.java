import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        // * pattern

        // for(int i=1 ; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // inverted * pattern 

        // for(int i=1; i<=n; i++){
        //     for(int j = n-i+1; j>=1 ; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        
        // }


        // half piramid pattern

        //  for(int i=1 ; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // print character pattern
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        
    }
    
}
