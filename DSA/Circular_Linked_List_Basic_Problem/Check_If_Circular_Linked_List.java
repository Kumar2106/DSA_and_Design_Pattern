package DSA.Circular_Linked_List_Basic_Problem;

public class Check_If_Circular_Linked_List {
    public static void main(String[] args) {
        
    }

    

    //CircularLinkedList
    public static class CircularLinkedList{
        Node head;
        Node point;

        CircularLinkedList(){
            this.head = null;
            this.point = null;
        }

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.next  = head;
                return;
            }
            Node next = point.next;
            point.next = iNode;
            iNode.next = next;
            point = point.next;
        }

        public void PrintList(){
            Node curr = head;

            if (curr == null) {
                System.out.println("Circular Linked list is empty");
                return;
            }

            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);
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
