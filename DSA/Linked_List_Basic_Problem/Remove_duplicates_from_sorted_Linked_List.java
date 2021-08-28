package DSA.Linked_List_Basic_Problem;

public class Remove_duplicates_from_sorted_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.PrintList();

        removeDuplicates(list);
        list.PrintList();
    }

    public static void removeDuplicates(LinkedList list){
        Node curr = list.head;

        if (curr == null) {
            System.out.println("Your linked List is empty");
            return;
        }

        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
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

            if(head == null){
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
