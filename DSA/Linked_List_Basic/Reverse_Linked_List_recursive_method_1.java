package DSA.Linked_List_Basic;

public class Reverse_Linked_List_recursive_method_1 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        PrintList(head);

        head = reverse(head,null);
        PrintList(head);

    }
    //code by GFG
    //TODO: There is some bug in the code.
    public static Node rNodeGFGNode(Node head){
        if (head == null || head.next == null) {
            return null;
        }

        Node rest_head = rNodeGFGNode(head.next);
        Node rest_tail = head;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
    public static Node reverse(Node curr, Node prev){
        if (curr == null) {
            return prev;
        }

        Node next = curr.next;
        curr.next=prev;
        prev = curr;
        curr = next;

       return reverse(curr, prev);
    }

    //utility function to print the element in the Linked List
    public static void PrintList(Node head){
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }

    //Node class implementation
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
