package DSA.Linked_List_Basic;

public class Remove_Duplicates_from_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(10);
        head.next.next = new Node(20);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(20);
        head.next.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next.next = new Node(30);
        head.next.next.next.next.next.next.next.next = new Node(30);
        printList(head);


        removeDuplicateNode(head);
        printList(head);
        
    }

    public static void removeDuplicateNode(Node head){
        
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
               curr.next = curr.next.next;
            }else{
                curr = curr.next;
            } 
        }
    }

    //utility function to print the elements of the Linked List
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data =num;
            next = null;
        }

        Node(){
            this.data =0;
            next = null;
        }
    }
}
