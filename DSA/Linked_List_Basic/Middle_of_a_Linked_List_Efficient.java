package DSA.Linked_List_Basic;



public class Middle_of_a_Linked_List_Efficient {
    public static void main(String[] args) {
        Node head = new Node(10);
        middle(head);

        head.next = new Node(20);
        middle(head);

        head.next.next = new Node(30);
        middle(head);

        head.next.next.next = new Node(40);
        middle(head);

        head.next.next.next.next = new Node(50);
        middle(head);
    }

    public static void middle(Node head){
        //if head is null
        if (head == null) {
            System.out.println("Your Linked List is empty");
            return;
        }

        Node slow_ptr = head;
        Node fast_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }

        System.out.println("Middle element in the Linked List is "+ slow_ptr.data);
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
