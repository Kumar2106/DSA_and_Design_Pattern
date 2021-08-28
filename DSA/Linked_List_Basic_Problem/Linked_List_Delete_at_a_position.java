package DSA.Linked_List_Basic_Problem;

public class Linked_List_Delete_at_a_position {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList();

        delete(list, 7);
        list.PrintList();
    }

    public static void delete(LinkedList list, int pos){
        if (pos == 1) {
            list.head = list.head.next;
            return;
        }

        Node curr = list.head;
        int index =1;

        while (curr != null && curr.next != null && index != pos -1) {
            curr = curr.next;
            index++;
        }
      
        if (index < pos) {
            System.out.println("No nodes exist at the requested Position");
            return;
        }

        if (curr.next != null) {
            curr.next = curr.next.next;
        }else{
            curr.next = null;
        }
    }

    //Linked List Class
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
