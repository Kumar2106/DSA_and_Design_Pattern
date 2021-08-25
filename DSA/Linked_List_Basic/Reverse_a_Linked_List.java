package DSA.Linked_List_Basic;

import java.util.ArrayList;

public class Reverse_a_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        PrintList(head);

        head = nRNode(head);
        PrintList(head);

        
    }

    //Naive Approach
    public static Node nRNode(Node head){
        ArrayList<Integer> list = new ArrayList<>();
        Node curr = head;
        int count =0;
        while(curr != null){
            count++;
            list.add(curr.data);
            curr = curr.next;
        }

        Node point = new Node();
        curr = point;
        for(int i=count-1; i>=0; i--){
            point.data = list.get(i);
            if (i!=0) {
                point.next = new Node();
                point = point.next;
            }
        }
        
        return curr;
    }

    public static Node rNode(Node head){

        if (head == null) {
            System.out.println("Sorry the Linked List is Empty");
            return null;
        }

        if (head.next == null) {
            return head;
        }

       Node prev =null;
       Node curr = head;

        while (curr != null) {
           Node next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
        return prev;
    }

    //utility function to print all the element of the Linked List
    public static void PrintList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.print("Null");
        System.out.println("");
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }

        Node(){

        }
    }
}
