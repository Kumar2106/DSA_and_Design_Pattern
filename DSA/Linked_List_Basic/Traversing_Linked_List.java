package DSA.Linked_List_Basic;



public class Traversing_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        print(head);
    }
    public static void print(Node head){
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next=null;
        }
    }
}
