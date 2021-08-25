package DSA.Linked_List_Basic_Problem;

public class Display_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList1();
    }

    //Linked List class
    public static class LinkedList{
        Node head;
        Node Point;

        LinkedList(){
            this.head = null;
            this.Point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
               Point= head = iNode; 
               return;
            }

            Point.next = iNode;
            Point = Point.next;
        }

        public void printList1(){
            Node curr = head;

            while(curr != null){
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }
            System.out.println("Null");
        }

    }


    //class Node
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
