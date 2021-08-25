package DSA.Linked_List_Basic;

public class Sorted_Insertion_in_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head = SortedInsertionGFG(head, 4);
        print(head);

        head = SortedInsertionGFG(head, 8);
        print(head);

        head = SortedInsertionGFG(head, 7);
        print(head);

        head = SortedInsertionGFG(head, 1);
        print(head);

        head = SortedInsertionGFG(head, 12);
        print(head);

        head = SortedInsertionGFG(head, 10);
        print(head);

        head = SortedInsertionGFG(head, 13);
        print(head);

    }

    //utility function to print the linked list
    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
    }

    //my own approach to the problem
    public static Node SortedInsertion(Node head, int num){
        Node iNode = new Node(num);

        //handling the case where head could be null
        if (head == null) {
            head = iNode;
            return head;
        }

        //num < head.data
        if (num< head.data) {
            iNode.next = head;
            head = iNode;
            return head;
        }

       Node curr = head;
       while(curr.data < num && curr.next.data <num){
           curr = curr.next;
           if(curr.next.next == null){
              if(curr.next.data < num){
                  curr = curr.next;
                  break;
              }else{
                  break;
              }
           }
       }

       if(curr.next != null){
           Node next = curr.next;
           curr.next = iNode;
           iNode.next = next;
       }else{
           curr.next = iNode;
       }

        return head;
    }

    //code by GFG
    public static Node SortedInsertionGFG(Node head, int x){
        Node temp = new Node(x);
        if (head ==null) {
            return temp;
        }

        if (x < head.data) {
            temp.next = head;
            return temp;
        }

        Node curr = head;

        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        }

        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    //Node Class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
