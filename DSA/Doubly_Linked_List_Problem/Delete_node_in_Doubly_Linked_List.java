package DSA.Doubly_Linked_List_Problem;

public class Delete_node_in_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(9);
        list.PrintList();

        list.head = dNode(list.head, 1);
        list.PrintList();

        list.head = dNode(list.head, 3);
        list.PrintList();

        list.head = dNode(list.head, 3);
        list.PrintList();
    }

    public static Node dNode(Node head, int pos){
        if (head == null) {
            return null;
        }

       Node curr = head;
       if (pos == 1) {
           if (curr.next == null) {
               return null;
           }else{
               Node next = curr.next;
               next.prev = null;
               curr.next = null;
               return next;
           }
       }

       int index = 1;

       while (curr != null && curr.next != null && index != pos) {
           curr = curr.next;
           index++;
       }

       if (index != pos) {
           System.out.println("Cannot delete the Specified position node");
           return head;
       }

       if (curr.next == null) {
           curr.prev.next = null;
           return head;
       }

       Node next = curr.next;
       Node prev = curr.prev;
       prev.next = next;
       next.prev = prev;
       return head; 
    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head,point;

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
            System.out.println("NUll");
        }
    }
    
    //Node class
    public static class Node{
        int data;
        Node prev, next;

        Node(int num){
            data = num;
            prev = next = null;
        }
    }
}
