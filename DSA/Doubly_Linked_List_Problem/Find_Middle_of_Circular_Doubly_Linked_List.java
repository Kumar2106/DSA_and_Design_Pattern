package DSA.Doubly_Linked_List_Problem;
public class Find_Middle_of_Circular_Doubly_Linked_List {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.PrintList();

        midPoint(list);
    }

    public static void midPoint(CircularDoublyLinkedList list){
        Node slow = list.head;
        Node fast = list.head;

        while (slow.next != list.head &&fast.next != list.head && fast.next.next != list.head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle of the Doubly Linked List is "+slow.data);
    }

    public static class CircularDoublyLinkedList{
        Node head,point;

        CircularDoublyLinkedList(){
            head = point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.next = head;
                head.prev = head;
                return;
            }
            Node next = point.next;
            point.next = iNode;
            iNode.prev = point;
            iNode.next = next;
            next.prev = iNode;
            point = point.next;
        }

        public void PrintList(){
            Node curr  = head;

            if (curr == null) {
                System.out.println("Doubly Linked List is Empty");
                return;
            }
            do{
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }while(curr != head);
            
            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next,prev;

        Node(int num){
            data = num;
            next = prev = null;
        }
    }
}
