package DSA.Circular_Linked_LIst_Basic;

public class Circular_Linked_List_Traversal {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList1();
    }

    //Circular Linked List
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

        public void PrintList(){
            Node curr = head;
            do{
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }while(curr != head);
            System.out.println("Circular Linked List");
        }

        public void PrintList1(){
            if (head == null) {
                System.out.println("Linked List is Empty");
                return;
            }

            System.out.print(head.data +" -> ");

            for(Node r =head.next; r!= head; r=r.next){
                System.out.print(r.data+" -> ");
            }
            System.out.println("Circular List ");
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
