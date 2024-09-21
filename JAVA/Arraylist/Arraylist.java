
import java.util.*;
public class Arraylist{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
         
        // add element 
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        // get element 

        int a = list.get(0);
        int b = list.get(1);
        System.out.println(a+" and "+b);

        //add element in between 
        list.add(0, 1);
        list.add(2, 5);
        System.out.println(list);

        // set element 
        list.set(2, 3);
        list.set(3, 4);
        list.set(4, 5);
        System.out.println(list);

        // remove element 
        list.remove(1);
        System.out.println(list);

        // size of ArrayList

        int n = list.size();
        System.out.println(n);

        // loops
        for(int i=0; i<n; i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}
