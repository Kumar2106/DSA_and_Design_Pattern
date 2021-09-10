package DSA.Stack_Basic_Problem;

public class Implement_Stack_Using_Linked_List {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        System.out.println(stack.pop());
        stack.pop();
        
    }

    private static class Stack{
        Node head;

        public void push(int num){
            Node iNode =new Node(num);
            iNode.next = head;
            head =iNode;
         }

         public int pop(){
             int num = -1;
            if (head != null) {
                 num = head.data;
                head = head.next;
            }else{
                System.out.println("Sorry stack is empty");
            }
            return num;
         }

        private static class Node{
            int data;
            Node next;
    
             Node(int num){
                data = num;
                next = null;
            }
        }

    }

    
}
