package DSA.Doubly_Linked_List;

public class Delete_Head_of_Doubly_Linked_list {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.PrintList();

        deleteHead(list);
        list.PrintList();

        deleteHead(list);
        list.PrintList();

        deleteHead(list);
        list.PrintList();

        deleteHead(list);
        list.PrintList();
    }

    public static void deleteHead(DoublyLinkedList list){
        Node curr = list.head;

        if (curr == null || curr.next == null) {
            list.head = null;
            return;
        }

       list.head = list.head.next;
       list.head.prev = null;

    }

    //DoublyLinkedList class
    public static class DoublyLinkedList{
        Node head;
        Node point;

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
                System.out.println("Doubly Linked List is Emtpy");
                return;
            }

            while (curr != null) {
                System.out.print(curr.data+" -> ");
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
            data=num;
            prev=next = null;
        }
    }
}
