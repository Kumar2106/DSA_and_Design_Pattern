package DSA.Doubly_Linked_List_Problem;
public class Doubly_Linked_List_Insertion_at_a_Point {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.PrintList();

        addNode(list, 0, 44);
        list.PrintList();

        addNode(list, 4, 43);
        list.PrintList();

        addNode(list, 1, 2);
        list.PrintList();

    }

    public static void addNode(DoublyLinkedList list, int pos, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head = list.point = iNode;
            return;
        }

        int index =0;
        Node curr = list.head;

        while (curr != null && curr.next != null && index != pos) {
            curr = curr.next;
            index++;
        }
        System.out.println("index: "+index+" pos: "+pos);;
        if (index != pos) {
            System.out.println("Cannot inserted at the specified position");
            return;
        }

        if (curr.next == null) {
            curr.next =iNode;
            iNode.prev = curr;
            return;
        }

        Node next = curr.next;
        curr.next =iNode;
        iNode.prev =curr;
        iNode.next = next;
        next.prev =iNode;
        
    }

    //DoublyLinkedList
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
                System.out.println("Doubly Linked List Empty");
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
        Node next, prev;

        Node(int num){
            data = num;
            next = prev = null;
        }
    }
}
