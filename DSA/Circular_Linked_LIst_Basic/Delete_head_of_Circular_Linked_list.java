package DSA.Circular_Linked_LIst_Basic;

public class Delete_head_of_Circular_Linked_list {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.PrintList();

        deleteHead(list);
        list.PrintList();

        deleteHead(list);
        list.PrintList();
    }

    //this function is given by GFG
    public static Node deleteHeadByGFG(Node head){
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }

        Node curr = head;

        while (curr.next != head) {
            curr = curr.next;
        }

        return curr.next = head.next;
        
    }

    public static void deleteHead(CircularLinkedList list){
        if (list.head == null || list.head.next == list.head) {
            list.head = null;
            return;
        }

        Node curr = list.head;
        int temp = curr.data;
        curr.data = curr.next.data;
        curr.next.data = temp;

        curr.next = curr.next.next;
    }

    //CircularLinkedList class
    public static class CircularLinkedList{
        Node head;
        Node point;

        CircularLinkedList(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);
            if (head == null) {
                head = point = iNode;
                head.next = head;
                return;
            }

            Node next = point.next;
            point.next = iNode;
            iNode.next = next;
            point = point.next;
        }

        public void PrintList(){
            if (head == null) {
                System.out.println("Circular Linked List is Empty");
                return;
            }

            Node curr = head;
            
            do {
                System.out.print(curr.data +" -> ");
                curr  = curr.next;
            } while (curr != head);

            System.out.println("Circular Linked List");
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
