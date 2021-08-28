package DSA.Linked_List_Basic_Problem;

public class Identical_Linked_List {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.PrintList();


        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.PrintList();

        isIdentical(list1,list2);
    }

    public static void isIdentical(LinkedList list1, LinkedList list2){
        Node curr1 = list1.head;
        Node curr2 = list2.head;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                System.out.println("Not Identical");
                return;
            }

            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        if (curr1 != null || curr2 != null) {
            System.out.println("Not Identical");
        }else{
            System.out.println("Identical");
        }
    }

    //Linked List
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
                head = point=iNode;
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
