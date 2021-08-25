package DSA.Linked_List_Basic;

public class Delete_Head_Node_in_Singly_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

       head = dHeadNode(head);
       print(head);
       head = dHeadNode(head);
       print(head);
    }

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }

        System.out.println("");
    }

    public static Node dHeadNode(Node head){
        if (head == null) {
            return null;
        }

        else{
            return head.next;
        }
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
