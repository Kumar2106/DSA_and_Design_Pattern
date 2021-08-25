package DSA.Linked_List_Basic;


public class Insert_at_the_end {
    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head,10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);
        print(head);
    }

    public static Node insertEnd(Node head, int num){
        Node temp = new Node(num);
        if(head == null){
            return temp;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;

    }


    public static void print(Node head){
        Node curr=head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr= curr.next;
        }
        System.out.println("");
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
