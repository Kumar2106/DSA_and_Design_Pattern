package DSA.Linked_List_Basic_Problem;

public class Nth_nodefrom_end_in_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.PrintList();

        NthNode(list, 1);
        NthNode(list, 2);
        NthNode(list, 3);
        NthNode(list, 4);
        NthNode(list, 5);
        NthNode(list, 6);
        NthNode(list, 7);
        NthNode(list, 8);
        NthNode(list, 9);
        NthNode(list, 10);
        NthNode(list, 11);
        
    }

    public static void NthNode(LinkedList list, int n){
        if (list.head == null) {
            System.out.println("Sorry the Linked List is empty");
            return;
        }

        Node first  = list.head;
        int index =0;

        while(first != null  && index != n){
            first = first.next;
            index++;
        }

        if (index<=n-1) {
            System.out.println("Position you asked for is empty");
            return;
        }

        Node second = list.head;

        while(first != null && second != null){
            first = first.next;
            second = second.next;
        }

        System.out.println("Nth Node is: "+second.data);

    }

    //LinkedList class
    public static class LinkedList{
        Node head;
        Node point;

        LinkedList(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                return;
            }

            point.next = iNode;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }
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
