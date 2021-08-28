package DSA.Circular_Linked_List_Basic_Problem;
public class Length_of_Circular_Linked_List {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList();
        
        System.out.println("Length of the List is "+Length(list));
       
    }

    public static int Length(CircularLinkedList list){
        Node curr = list.head;
        int count =0;

        if (curr == null) {
            System.out.println("Circular Linked List Empty");
            return 0;
        }

        do{
            count++;
            curr = curr.next;
        }while(curr != list.head);

        return count;
    }

    //CircularLinkedList class
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

            if (curr == null) {
                System.out.println("Circular Linked List Empty");
                return;
            }

            do{
                System.out.print(curr.data + " -> ");
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
            this.data = num;
            next = null;
        }
    }
}
