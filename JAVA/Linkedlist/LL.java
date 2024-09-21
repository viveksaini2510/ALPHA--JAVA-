
import java.util.LinkedList;
import java.util.*;
class LL {
    Node head;
    private int size;
    LL(){
        this.size =0;
    }
        class Node{
            String data;
            Node next;

            Node (String data){
                this.data = data;
                this.next = null;
                size++;
            }
         }

         // addfirst
         public void addfirst(String data){
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next= head;
            head =newNode;
            
         }

         // add last 
          public void addlast(String data){
            Node newNode = new Node(data);
                if(head == null){
                head = newNode;
                return;
                }
             Node currNode = head;
             while (currNode.next != null) {
                currNode = currNode.next;
             }
                currNode.next = newNode;
            }  
            
            // print list
            
            public void printlist(){
                if (head==null) {
                    System.out.println("Empty lsit:");
                    return;
                }
                Node currNode = head;
                while (currNode!=null) {
                    System.out.print(currNode.data+" -> ");
                    currNode = currNode.next;
                }   
                System.out.println("NULL");
            }



            // delete first 

            public void deleteFirst(){
                if (head ==null) {
                    System.out.println("The list is empty:");
                    return;
                }
                size--;
                head = head.next;
            }

            // delete last

            public void deleteLast(){
                if (head==null) {
                    System.out.println("The list is empty:");
                    return;
                    
                }
                size--;
                if (head.next==null) {
                    head =null;
                    return;
                }
                Node secondLast = head;
                Node lastNode = head.next;
                while (lastNode.next!=null) {
                    secondLast=secondLast.next;
                    lastNode=lastNode.next;
                }
                secondLast.next=null;

            }

            //size of linked list
            public int getsize(){
                return size;
            }


    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        
        list.addlast("list");
        list.addfirst("this");
        list.printlist();

        list.deleteFirst();
        list.printlist();
        list.addfirst("null");
        list.deleteLast();
        list.addfirst("this");
        list.printlist();

        System.out.println(list.getsize());

    }
    
}
