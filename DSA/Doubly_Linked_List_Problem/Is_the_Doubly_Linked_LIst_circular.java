package DSA.Doubly_Linked_List_Problem;
public class Is_the_Doubly_Linked_LIst_circular {
    public static void main(String[] args) {
        DoublyCircularLinkedList Clist = new DoublyCircularLinkedList();
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.PrintList();


        Clist.add(4);
        Clist.add(6);
        Clist.PrintList();
    }

    //DoublyCircularLinkedList 
    public static class DoublyCircularLinkedList{
        Node head,point;

        DoublyCircularLinkedList(){
            head = point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.prev = head;
                head.next = head;
                return;
            }

            Node next = point.next;
            point.next = iNode;
            iNode.prev = point;
            iNode.next = next;
            next.prev = iNode;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Doubly Linked List Empty");
                return;
            }

            do{
                System.out.print(curr.data +" <-> ");
                curr = curr.next;
            }while(curr != head);

            System.out.println("Null");
        }
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
        Node prev, next;

        Node(int num){
            data = num;
            next = prev = null;
        }
    }
}
