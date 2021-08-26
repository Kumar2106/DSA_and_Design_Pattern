package DSA.Linked_List_Basic_Problem;
public class Search_In_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        search(list, 2);
    }

    public static void search(LinkedList list, int num){
        Node curr = list.head;

        while (curr !=null) {
            if (curr.data == num) {
                System.out.println("yes "+num+" is present in the Linked List");
                return;
            }
            curr = curr.next;
        }

        System.out.println("No "+num+" is not present in the Linked List");
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
                head = point = iNode;
                return;
            }

            point.next = iNode;
            point = point.next;
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
