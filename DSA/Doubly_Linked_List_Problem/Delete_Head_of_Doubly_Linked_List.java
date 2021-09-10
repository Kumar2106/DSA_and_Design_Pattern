package DSA.Doubly_Linked_List_Problem;
public class Delete_Head_of_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(100);
        list.PrintList();

        list.head = deleteHeadNode(list.head);
        list.PrintList();

        list.head = deleteHeadNode(list.head);
        list.PrintList();
    }

    public static Node deleteHeadNode(Node head){
        Node curr = head;

        if (curr == null || curr.next == null) {
            return null;
        }

        Node next = curr.next;

        next.prev = null;
        curr.next = null;
        return next;
    }
    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head, point;
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

        public  void PrintList() {
            Node curr = head;

            if(curr == null){
                System.out.println("Doubly Linked List is Empty");
                return;
            }

            while(curr != null){
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node prev,next;

        Node(int num){
            data = num;
            next = prev = null;
        }
    }
}
