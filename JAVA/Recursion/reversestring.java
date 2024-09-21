import java.util.*;
public class reversestring {
    public static int first = -1;
    public static int lasr = -1;
    
    public static void reverse(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx)+" ");
        reverse(str, idx-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        reverse(str,str.length()-1);
    
    }
        
}
