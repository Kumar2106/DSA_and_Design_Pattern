package DSA.Linked_List_Basic_Problem;

public class Linked_List_Insertiong_Basic_Problem {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 1);
        list.insert(2, 0);
        list.insert(3, 1);
        list.PrintList();
    }

    //Linked List class
    public static class LinkedList{
        Node head;
        Node lPoint;

        LinkedList(){
            this.head = null;
            this.lPoint = null;
        }

        public void insert(int num, int pos){
            Node iNode = new Node(num);
            if (head == null) {
                head =lPoint = iNode;
                return;
            }

            //if pos == 0 insert it in the begining
            if (pos == 0) {
                iNode.next = head;
                head =iNode;
                return;
            }else  if(pos == 1){
                //if pos==1 insert the num at the last posisiton in the Linked List
                lPoint.next = iNode;
                lPoint = lPoint.next;
                
            }
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
