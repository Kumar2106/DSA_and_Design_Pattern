package DSA.Linked_List_Basic;


/**
 * Delete_Last_Node_In_Singly_Linked_List
 */
public class Delete_Last_Node_In_Singly_Linked_List {

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        dLastNode(head);
        print(head);

        dLastNode(head);
        print(head);

        dLastNode(head);
        print(head);
    }

    public static void print(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public static Node dLastNode(Node head){
        Node curr = head;

        if (head == null || head.next  == null) {
            return null;
        }

        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return curr;
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