package DSA.Circular_Linked_LIst_Basic;

public class Delete_Kth_Node_from_Circular_Linked_List {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.PrintList();

        deletekthNode(list, 3);
        list.PrintList();

        deletekthNode(list, 1);
        list.PrintList();

        deletekthNode(list, 1);
        list.PrintList();
    }

    public static void deletekthNode(CircularLinkedList list, int pos){
        Node curr = list.head;
            if (pos == 1) {
                 if (curr.next == list.head) {
                     list.head = null;
                     return;
                 }else{
                    curr.data = curr.next.data;
                 curr.next = curr.next.next;
                 return;
                 }
            }

        int index = 1;

        while (curr.next != list.head && index<pos-1) {
            curr = curr.next;
            index++;
        }

        curr.next = curr.next.next;
    }

    //CircularLinkedList class
    public static class CircularLinkedList{
        Node head;
        Node point;

        public void add(int num){
            Node iNode = new Node(num);

            if (head == null) {
                head = point = iNode;
                head.next = head;
                return;
            }

            Node next = point.next;
            point.next = iNode;
            iNode.next = next;
            point = point.next;
        }

        public void PrintList(){
            if (head == null) {
                System.out.println("Circular Linked List is empty");
                return;
            }

            Node curr = head;
            
            do{
                System.out.print(curr.data +" -> ");
                curr = curr.next;
            }while(curr != head);

            System.out.println("circular Linked List");
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
