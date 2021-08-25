package DSA.Linked_List_Basic;



public class Inserting_at_a_position_in_singly_Linked_list {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(30);
        head.next.next = new Node(50);
        head.next.next.next = new Node(70);

       head= insertAtPosition(head, 1, 5);
       print(head);

       head = insertAtPosition(head, 2, 7);
       head = insertAtPosition(head, 4, 15);
       print(head);
       head = insertAtPosition(head, 8, 80);
       print(head);
    }

    public static Node insertAtPosition(Node head, int pos, int num){
        Node iNode = new Node(num);
        Node curr = head;
        
        
        if (pos == 1) {
            iNode.next = head;
            head = iNode;
            return head;
        }

        int index =1;
        while (curr !=null) {
            if (pos == index) {
               if (curr.next != null) {
                int data = curr.data;
                curr.data = num;

                iNode.data = data;
                Node next = curr.next;
                curr.next = iNode;
                iNode.next = next;
                
               }else{
                   curr.next = iNode;
                  
               }
            }

            curr = curr.next;
            index++;
        }
        return head;

    }

    public static void print(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println("");
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
