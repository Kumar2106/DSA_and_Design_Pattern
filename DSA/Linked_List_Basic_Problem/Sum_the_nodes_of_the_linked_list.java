package DSA.Linked_List_Basic_Problem;

/**
 * Sum_the_nodes_of_the_linked_list
 */
public class Sum_the_nodes_of_the_linked_list {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Sum of all element of the Linked list is "+sum(list));
    }

    public static int sum(LinkedList list){
        Node curr = list.head;
        int sum =0;

        while (curr != null) {
            sum+=curr.data;
            curr = curr.next;
        }

        return sum;
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
                Point=head= iNode;
                return;
            }

            Point.next = iNode;
            Point = Point.next;
        }

        public void PrintList(){
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