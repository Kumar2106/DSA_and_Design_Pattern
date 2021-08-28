package DSA.Linked_List_Basic_Problem;

public class Delete_Head_of_Linked_List {
    public static void main(String[] args) {
        LinkedList list  = new LinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(100);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();

        deleteHead(list);
        list.printList();
    }

    public static void deleteHead(LinkedList list){
        if (list.head == null || list.head.next == null) {
            list.head = null;
            return;
        }

        list.head = list.head.next;
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
