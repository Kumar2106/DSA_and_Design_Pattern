package DSA.Linked_List_Basic_Problem;

public class Max_and_Min_in_a_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(12);
        list.add(1);
        list.add(78);
        list.add(88);
        list.add(-1);
        max_min(list);


    }
    
    public static void max_min(LinkedList list){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Node curr = list.head;
        
        while(curr != null){
            if (max < curr.data) {
                max = curr.data;
            }

            if (min > curr.data) {
                min = curr.data;
            }

            curr = curr.next;
        }

        if (max != Integer.MIN_VALUE && min !=Integer.MAX_VALUE ) {
            System.out.println("Max: "+max+", Min: "+min);
        }
    }

    //LinkedList class
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
                head =Point = iNode;
                return;
            }

            Point.next = iNode;
            Point = Point.next;
        }
    }

    //class Node
    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
