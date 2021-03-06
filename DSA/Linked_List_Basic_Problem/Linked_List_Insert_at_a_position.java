package DSA.Linked_List_Basic_Problem;
public class Linked_List_Insert_at_a_position {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(3);
        list.PrintList();

        insertAtPosition(list, 2, 1);
        list.PrintList();

        insertAtPosition(list, 4, 3);
        list.PrintList();

        insertAtPosition(list, 5, 4);
        list.PrintList();

        insertAtPosition(list, 10, 1);
        list.PrintList();
    }

    public static void insertAtPosition(LinkedList list,int num, int pos){
        Node iNode = new Node(num);
        Node curr = list.head;
        int index = 1;

        while (curr != null && curr.next != null && index != pos) {
            curr = curr.next;
            index++;
        }
       
        if (index < pos) {
            System.out.println("Cannot insert at the given position");
            return;
        }

        Node next = curr.next;
        curr.next = iNode;
        iNode.next = next;

    }

    //Linked List class
    public static class LinkedList{
        Node head;
        Node point;

        LinkedList(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                return;
            }

            point.next = iNode;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }

            System.out.println("Null");
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
