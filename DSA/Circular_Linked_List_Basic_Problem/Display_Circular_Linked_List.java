package DSA.Circular_Linked_List_Basic_Problem;

public class Display_Circular_Linked_List {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        PrintList(list);
    }

    public static void PrintList(CircularLinkedList list){
        Node curr = list.head;

        if (curr == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        do{
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }while(curr != list.head);

        System.out.println("Head Node");
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
