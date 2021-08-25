package DSA.Linked_List_Basic;

public class Nth_Node_from_end_In_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        NthNode(head, 1);
        NthNode(head, 2);
        NthNode(head, 3);
        NthNode(head, 4);
        NthNode(head, 5);
    }

    public static void NthNode(Node head, int pos){
        //if head is null
        if (head == null) {
            System.out.println("your Linked List is empty");
            return;
        }

        int count =0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        if (pos > count) {
            System.out.println("There is not too much element in the Linked list");
            return;
        }

        int dPos = count - pos +1;

        int index =1;
        curr = head;
        while (index != dPos && curr != null  ) {
            curr = curr.next;
            index++;
        }

        System.out.println("Element at "+pos+" from end is "+curr.data);
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
