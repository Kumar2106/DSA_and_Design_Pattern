package DSA.Linked_List_Basic;



public class Linked_List_Implementation_by_Geeks_for_geeks {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        head.next = temp1;
        temp1.next = temp2;
    }

    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
