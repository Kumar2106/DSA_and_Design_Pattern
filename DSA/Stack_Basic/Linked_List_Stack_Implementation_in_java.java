package DSA.Stack_Basic;
public class Linked_List_Stack_Implementation_in_java {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.getSize());

    }

    public static class Stack{
        Node head;
        int size;

        Stack(){
            head = null;
            size =0;
        }

        public void push(int num){
            Node iNode = new Node(num);
            if (head == null) {
                head = iNode;
                size++;
                return;
            }

            iNode.next = head;
            head = iNode;
            size++;
        }

        public int pop(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            int num = head.data;
            head = head.next;
            size--;
            return num;
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return head.data;
        }

        public boolean isEmpty(){
            if (head == null) {
                return true;
            }
            return false;
        }

        public int getSize(){
            return size;
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
