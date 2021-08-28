package DSA.Circular_Linked_LIst_Basic;

public class Insert_at_the_end_of_Circular_linked_list {
    public static void main(String[] args) {
        CircularLinkedLIst list = new CircularLinkedLIst();
        list.add(10);
        list.add(20);
        list.add(30);
        list.PrintList();

        insertAtLast(list, 40);
        list.PrintList();

        insertAtLast(list, 50);
        list.PrintList();

        list.head =insertAtLastByGFG(list.head, 60);
        list.PrintList();
    }

    //time complexity o(1)
    public static Node insertAtLastByGFG(Node head, int num){
        Node temp = new Node(num);

        if (head == null) {
            temp.next = temp;
            return temp;
        }else{
            temp.next = head.next;
            head.next = temp;
            int t = temp.data;
            temp.data = head.data;
            head.data = t;
            return temp;
        }
    }

    //time complexity 0(n)
    public static void insertAtLast(CircularLinkedLIst list, int num){
        Node iNode = new Node(num);

        if (list.head == null) {
            list.head =iNode;
            list.head.next = list.head;
            return;
        }

        Node curr = list.head;

        while (curr.next != list.head) {
            curr = curr.next;
        }

        Node next = curr.next;
        curr.next = iNode;
        iNode.next = next;
    }


    //circularLinkedList class
    public static class CircularLinkedLIst{
        Node head;
        Node point;

        CircularLinkedLIst(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head=point=iNode;
                head.next = head;
                return;
            }

            Node next =point.next;
            point.next = iNode;
            iNode.next = next;
            point = point.next;
        }

        public void PrintList(){
            if (head == null) {
                System.out.println("Linked List is Empty");
                return;
            }

            Node curr = head;

            do{
                System.out.print(curr.data +" -> ");
                curr=curr.next;
            }while(curr != head);
            System.out.println("Circular Linked list");
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
