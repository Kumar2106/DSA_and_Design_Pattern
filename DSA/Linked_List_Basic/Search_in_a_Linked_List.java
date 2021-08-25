package DSA.Linked_List_Basic;


public class Search_in_a_Linked_List {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(20);
        head.next.next.next = new Node(15);
        int x = 15;

        System.out.println("Iteratively searching for x in the Linked List");
        System.out.println(IterativeSearch(head, x));

        System.out.println("");
        System.out.println("Recursively searching for x in the linked list");
        System.out.println(recursiveSearchO(head, x));
    }

    //this is iterative way to searach for a particular element in the linked list
    public static int IterativeSearch(Node head, int x){
        int count =1;
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                return count;
            }
            count++;
            curr = curr.next;
        }

        return -1;
    }

    //this is the recursive way to search for a element in the linked List
    public static int recursiveSearch(Node head, int x, int count){

       if(head != null){
           if (head.data == x) {
               return count;
           }
           return recursiveSearch(head.next, x,count+1);
       }

        return -1;
    }


    //this is optimization over the previous algo used
    public static int recursiveSearchO(Node head, int x){
        if (head == null ) {
            return -1;
        }

        if (head.data == x) {
            return 1;
        }

        int res = recursiveSearchO(head.next, x);
        if (res == -1) {
            return -1;
        }else{
            return res+1;
        }
    }


    public static class Node{
        int data;
        Node next;

        Node(int num){
            this.data = num;
            next = null;
        }
    }
}
