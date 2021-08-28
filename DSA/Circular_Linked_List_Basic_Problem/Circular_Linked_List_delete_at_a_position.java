package DSA.Circular_Linked_List_Basic_Problem;
public class Circular_Linked_List_delete_at_a_position {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(100);
        list.PrintList();

        deleteNthNode(list, 1);
        list.PrintList();

        deleteNthNode(list, 5);
        list.PrintList();

        deleteNthNode(list, 5);
        deleteNthNode(list, 4);
        list.PrintList();
    }

    public static void deleteNthNode(CircularLinkedList list, int n){
        if (n == 1) {
            if (list.head.next == list.head) {
                list.head = null;
                return;
            }else{
                list.head.data = list.head.next.data;
                list.head.next = list.head.next.next;
                return;
            }
        }

        Node curr = list.head;
        int index =1;

        while (curr.next.next != list.head && index< n-1) {
            curr = curr.next;
            index++;
        }

        if (index != n-1) {
            System.out.println("Cannot remove the requested Position");
            return;
        }

        curr.next = curr.next.next;
    }

    //CircularLinkedList
    public static class CircularLinkedList{
        Node head;
        Node point;

        CircularLinkedList(){
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

        public  void PrintList() {
            Node curr = head;

            if (curr == null) {
                System.out.println("circular Linked List Empty");
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
