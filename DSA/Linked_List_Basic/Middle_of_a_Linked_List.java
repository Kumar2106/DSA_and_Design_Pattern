package DSA.Linked_List_Basic;

 import java.util.*;

public class Middle_of_a_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        middle(head);

        head.next = new Node(20);
        middle(head);

        head.next.next = new Node(30);
        middle(head);

        head.next.next.next = new Node(40);
        middle(head);

        head.next.next.next.next  = new Node(50);
        middle(head);

        head.next.next.next.next.next = new Node(60);
        middle(head);
    }


    public static void middle(Node head){
        //if head is null
        if (head == null) {
            System.out.println("There is no element present in the linked list");
            return;
        }
       
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        curr = head;
        for(int i=0; i<count/2; i++){
            curr = curr.next;
        }
        System.out.println("Middle elment in the linked lis is "+ curr.data);
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
