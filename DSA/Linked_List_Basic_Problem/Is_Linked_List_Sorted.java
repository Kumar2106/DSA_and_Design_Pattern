package DSA.Linked_List_Basic_Problem;

public class Is_Linked_List_Sorted {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(32);
        list.add(12);
        list.add(10);
        isSorted(list);
        list.PrintList();
    }

    public static void isSorted(LinkedList list){
        if (list.head == null) {
            System.out.println("Sorry the Linked list is empty");
            return;
        }

        if(list.head.next == null){
            System.out.println("Yes the Linked list is sorted");
            return;
        }

        Node curr = list.head;

       if (isIncreasinglySorted(curr)) {
           System.out.println("Yes the LInked List is sorted Increasingly");
       }else if(isDecreasinglySorted(curr)){
           System.out.println("yes the Linked List is sorted Decreasingly");
       }else{
        System.out.println("No the Linked List is not Sorted");
       }

      
    }

    public static boolean isDecreasinglySorted(Node node){
        Node curr = node;
        while (curr != null && curr.next != null) {
            if (curr.data < curr.next.data) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    public static boolean isIncreasinglySorted(Node node){
        Node curr = node;
        while (curr != null && curr.next != null) {
            if (curr.data > curr.next.data) {
                return false;
            }

            curr = curr.next;
        }

        return true;
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
