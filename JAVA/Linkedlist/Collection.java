import java.util.*;
class Collection {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.add("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());

        // print list 
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        // remove Node 

        list.removeFirst();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

    }
}
