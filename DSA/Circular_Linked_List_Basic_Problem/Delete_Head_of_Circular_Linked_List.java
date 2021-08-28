package DSA.Circular_Linked_List_Basic_Problem;
public class Delete_Head_of_Circular_Linked_List {
    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(100);
        list.PrintList();

        deleteHead(list);
        list.PrintList();

        deleteHead(list);
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

    public static void deleteHead(circularLinkedList list){
        if (list.head == null || list.head.next ==list.head) {
            list.head = null;
            return;
        }

        list.head.data = list.head.next.data;
        list.head.next = list.head.next.next;
    }

    //circularLinkedList class
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
                System.out.println("circular Linked List is Empty");
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
            data = num;
            next = null;
        }
    }
}
