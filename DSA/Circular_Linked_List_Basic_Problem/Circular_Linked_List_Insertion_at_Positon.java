package DSA.Circular_Linked_List_Basic_Problem;
public class Circular_Linked_List_Insertion_at_Positon {
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(5);
        list.add(1);
        list.add(0);
        list.PrintList();

        insertAtPosition(list, 1, 10);
        list.PrintList();

        insertAtPosition(list, 9, 12);

    }

    public static void insertAtPosition(circularLinkedList list, int pos, int num){
        Node iNode = new Node(num);
        Node curr = list.head;

        if (curr == null) {
            list.head = list.point=iNode;
            list.head.next = list.head;
            return;
        }

        int index =1;

        while(curr.next != list.head && index != pos){
            curr = curr.next;
            index++;
        }

        if (index != pos) {
            System.out.println("Cannot inset at the Specified Position");
            return;
        }

        Node next = curr.next;
        curr.next = iNode;
        iNode.next = next;
    }

    //circularLinkedList
    public static class circularLinkedList{
        Node head;
        Node point;

        circularLinkedList(){
            head = null;
            point = null;
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
            Node curr = head;

            if (curr == null) {
                System.out.println("circular Linked List is empty");
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
