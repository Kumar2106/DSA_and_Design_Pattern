package DSA.Linked_List_Basic_Problem;

public class Join_two_Linked_List {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(5);


        LinkedList list2 = new LinkedList();
        list2.add(3);
        list2.add(4);

        merge(list1, list2);

        list1.PrintList();

    }

    public static void merge(LinkedList list1, LinkedList list2){
        if (list1.head == null) {
            list1.head = list2.head;
            return;
        }

        Node curr = list1.head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = list2.head;
    }

    //Linked List class
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
