package DSA.Stack_Basic;

/**
 * Stack_implemetaion_in_java
 */
public class Stack_implemetaion_in_java {

    public static void main(String[] args) {
        Stack s = new Stack(5);
       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
       s.pop();
       s.push(6);
       s.pop();
       s.push(7);
        System.out.println(s.pop());
    }

    public static class Stack{
        int capacity;
        int arr[];
        int top;
        int size;

        Stack(int capacity){
            size =0;
            arr = new int[capacity];
            this.capacity = capacity;
            top = -1;
        }

        public boolean isEmpty(){
            if(top == -1){
                return true;
            }
            return false;
        }

        public boolean isFull(){
            if (capacity == size) {
                return true;
            }
            return false;
        }

        public void push(int num){
           if(!isFull()){
            arr[++top] = num;
            size++;
            return;
           }

           System.out.println("Stack is already full");
        }

        public int pop(){
            if(!isEmpty()){
                int num = arr[top];
            arr[top]=0;
            top--;
            size--;
            return num;
            }

            System.out.println("stack is empty");
            return -1;
        }

        public int peek(){
            if (!isEmpty()) {
                return arr[top];
            }
            return -1;
        }



    }
}