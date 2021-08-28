package DSA.Linked_List_Basic_Problem;

public class Insert_in_Sorted_list {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.PrintList();

        sortedInsertion(list, 11);
        list.PrintList();

        sortedInsertion(list, 1);
        list.PrintList();

        sortedInsertion(list, 6);
        list.PrintList();

        sortedInsertion(list, 7);
        list.PrintList();
    }

    public static void sortedInsertion(LinkedList list, int num){
        Node iNode = new Node(num);

        if (list.head.data > num) {
            iNode.next = list.head;
            list.head = iNode;
            return;
        }

        Node curr = list.head;

        while (curr != null && curr.next != null && curr.data < num && curr.next.data < num) {
            curr = curr.next;
        }

        Node next = curr.next;
        curr.next = iNode;
        iNode.next =next;
    }

    //LinkedList class
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
                head =point = iNode;
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
