package DSA.Doubly_Linked_List_Problem;

import java.util.ArrayList;

public class Display_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList();

        ArrayList<Integer> output = display(list);
        System.out.println(output);
        
    }

    public static ArrayList<Integer> display(DoublyLinkedList list){
        Node curr = list.head;

        ArrayList<Integer> result = new ArrayList<>();
        
        while (curr != null) {
            result.add(curr.data);
            curr = curr.next;
        }

        return result;
    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

        DoublyLinkedList(){
            head = point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                return;
            }

            point.next = iNode;
            iNode.prev = point;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            while (curr != null) {
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next,prev;

        Node(int num){
            data = num;
            next  = prev = null;
        }
    }
}
