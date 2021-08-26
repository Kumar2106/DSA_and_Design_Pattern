package DSA.Linked_List_Basic_Problem;

public class Insert_in_middle_of_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        insertAtMiddle(list, 3);
        list.printList();

        list.add(2);
        list.printList();

        insertAtMiddle(list, 4);
        list.printList();

        insertAtMiddle(list, 5);
        list.printList();

        insertAtMiddle(list, 6);
        list.printList();

        insertAtMiddle(list, 7);
        list.printList();
    }

    public static void insertAtMiddle(LinkedList list , int num){
        Node iNode = new Node(num);
        if (list.head == null) {
            list.head=list.Point = iNode;
            list.size++;
            return;
        }

        Node curr = list.head;
        int count = list.size;
        int index =1;

        while (curr != null) {
            if (index == (count+1)/2) {
                Node next = curr.next;
                curr.next=iNode;
                iNode.next = next;
                list.size++;
                return;
            }else{
                curr=curr.next;
                index++;
            }
            
        }

    }

    //Linked List class
    public static class LinkedList{
        Node head;
        Node Point;
        int size;

        LinkedList(){
            this.head = null;
            this.Point = null;
            size =0;
        }


        public void add(int num){
            Node iNode = new Node(num);
            if (head == null) {
                head =Point = iNode;
                size++;
                return;
            }

            Point.next = iNode;
            Point = Point.next;
            size++;
        }

        //utility function to print the element of the Linked List
        public void printList(){
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
