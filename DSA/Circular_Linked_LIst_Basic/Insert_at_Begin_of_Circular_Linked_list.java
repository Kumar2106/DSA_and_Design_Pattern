package DSA.Circular_Linked_LIst_Basic;

public class Insert_at_Begin_of_Circular_Linked_list {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.PrintList();

        insertAtBegin(list, 60);
        list.PrintList();
    }

    public static void insertAtBegin(CircularLinkedList list, int num){
        Node iNode = new Node(num);

        Node curr = list.head;

        if (curr == null) {
            list.head = list.point = iNode;
            list.head.next = list.head;
            return;
        }

        Node next = curr.next;
        curr.next = iNode;
        iNode.next = next;
        int t = curr.data;
        curr.data = iNode.data;
        iNode.data = t;

    }

    //CircularLinkedList
    public static class CircularLinkedList{
        Node head;
        Node point;

        CircularLinkedList(){
            this.head = null;
            this.point = null;
        }

        public  void add(int num){
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
            Node curr = head;

            if (curr == null) {
                System.out.println("Linked List empty");
                return;
            }

            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);
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
