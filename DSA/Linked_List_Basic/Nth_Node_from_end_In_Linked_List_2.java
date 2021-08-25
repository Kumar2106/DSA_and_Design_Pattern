package DSA.Linked_List_Basic;

public class Nth_Node_from_end_In_Linked_List_2 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        NthNode(head, 4);
        NthNode(head, 5);
        NthNode(head, 3);
        NthNode(head, 2);
        NthNode(head, 1);
        NthNode(head,-1);
        head = null;
        NthNode(head, 2);

    }

    public static void NthNode(Node head, int pos){
        if (head == null) {
            System.out.println("Head is null");
            return;
        }

        if (pos < 0) {
            System.out.println("Sorry the Position is negative");
            return;
        }

        Node first =head;
        Node second = head;

        int index =0;
        while (first != null && index != pos) {
            first = first.next;
            index++;
        }
      
        if(index < pos){
            System.out.println("Sorry the Linked List is not so big");
            return;
        }
        

        while(first != null){
            first = first.next;
            second = second.next;
        }

        System.out.println("Elment at "+pos+" from end is "+ second.data);
    }

    //class Node
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
