package DSA.Linked_List_Basic;

public class Linked_List_Implementation {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(5);
        list.add(6);
        list.print();
    }

    public static class LinkedList{
        Node lNode;
        Node hNode;

        public void add(int num){
            Node iNode = new Node(num);

            if(lNode == null){
                lNode=iNode;
                hNode = lNode;
                return;
            }

            hNode.next = iNode;
            hNode=hNode.next;
        }


        public void print(){
            Node hNode = lNode;

            if (hNode == null) {
                System.out.println("Linked List is empty");
            }

            while(hNode != null){
                System.out.print(hNode.data+" ");
                hNode = hNode.next;
            }
            System.out.println(" ");
        }
    }

    //Node class
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
