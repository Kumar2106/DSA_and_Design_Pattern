package DSA.Linked_List_Basic_Problem;



public class Count_nodes_of_Linked_List {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Total number of nodes in the Linked List is "+count(list));
    }

    public static int count(LinkedList list){
        Node curr = list.head;
        int count =0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    //Linked List class
    public static class LinkedList{
        Node head;
        Node Point;

        LinkedList(){
            this.head = null;
            this.Point = null;
        }

        public  void add(int num){
            Node iNode = new Node(num);

            if(head == null){
                head = Point = iNode;
                return;
            }

            Point.next = iNode;
            Point = Point.next;
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

        Node(){

        }
    }
}
