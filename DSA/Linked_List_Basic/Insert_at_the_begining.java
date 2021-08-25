package DSA.Linked_List_Basic;



public class Insert_at_the_begining {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(5);
        list.insertAtTheBegining(3);
        list.print();
    }

    //LinkedList Class
    public static class LinkedList{
        Node initial;
        Node head;

        public void add(int num){
            Node iNode = new Node(num);

            if(initial == null){
                initial = iNode;
                head = initial;
                return;
            }

            head.next = iNode;
            head = head.next;
        }

        public void insertAtTheBegining(int num){
            Node iNode = new Node(num);

            iNode.next = initial;
            initial = iNode;

            
        }

        public void print(){
            Node curr = initial;

            while(curr != null){
                System.out.print(curr.data +" ");
                curr = curr.next;
            }

            System.out.println("");
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
