package DSA.Circular_Linked_List_Basic_Problem;

public class Circular_Linked_List_Tail_Insert {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.PrintlList();

        insertAtTail(list, 5);
        list.PrintlList();

        insertAtTail(list, 6);
        list.PrintlList();
    }

    public static void insertAtTail(CircularLinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head = list.point = iNode;
            list.head.next = list.head;
            return;
        }
        Node curr = list.head;
        Node next = curr.next;
        curr.next = iNode;
        iNode.next = next;

        int temp = curr.data;
        curr.data = curr.next.data;
        curr.next.data = temp;
        list.head = curr.next;

    }

    //Circular Linked List
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

        public void PrintlList(){
            Node curr = head;
            if(curr == null){
                System.out.println("Circular linked List Empty");
                return;
            }

            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);

            System.out.println("Head");
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
