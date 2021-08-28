package DSA.Circular_Linked_List_Basic_Problem;

public class Delete_Tail_of_Circular_Linked_List {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(100);
        list.PrintList();

        deleteTail(list);
        list.PrintList();

        deleteTail(list);
        list.PrintList();

        deleteTail(list);
        list.PrintList();

        deleteTail(list);
        list.PrintList();

        deleteTail(list);
        list.PrintList();

        deleteTail(list);
        list.PrintList();
    }

    public static void deleteTail(CircularLinkedList list){
        Node curr = list.head;

        if (curr == null || curr.next == list.head) {
            list.head = null;
            return;
        }

        while (curr.next.next != list.head) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
    }

    //circularLinkedList
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
            point =point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Circular Linked List is Empty");
                return;
            }

            do{
                System.out.print(curr.data + " -> ");
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
