package DSA.Doubly_Linked_List_Problem;
public class Compare_Circular_Doubly_Linked_List {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        DoublyLinkedList list2 = new DoublyLinkedList();

        list1.add(2);
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(99);
        list1.add(100);
        list1.PrintList();

        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(73);
        list2.add(2);
        list2.PrintList();

        if (compareCLL(list1, list2)) {
            System.out.println("Both of the list are equal");
        }else{
            System.out.println("Both of the list are unequal");
        }
    }

    public static boolean compareCLL(DoublyLinkedList list1, DoublyLinkedList list2){
        Node head1 = list1.head;
        Node head2 = list2.head;

        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) {
                return false;
            }
            
            head1 = head1.next;
            head2 = head2.next;
        }

        if (head1 != null || head2 != null) {
            return false;
        }

        return true;
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
            point =point.next;
        }

        public void PrintList(){
            Node curr = head;

            if(curr == null){
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
        Node prev,next;

        Node(int num){
            data = num;
            next = prev = null;
        }
    }
}
