package DSA.Stack_Basic_Problem;

public class Implement_stack_Using_Array {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

    private static class Stack{
        int capacity;
        int arr[];
        int top;
        int size;

        Stack(int cap){
            capacity = cap;
            arr = new int[cap];
            top = -1;
            size =0;
        }

        public void push(int num){
            if(!isFull()){
                arr[++top] = num;
                size++;
            }else
            {
                System.out.println("Sorry the stack is Full");
            }
        }

        public int pop(){
            if(!isEmpty()){
                int num = arr[top--];
                size--;
                return num;
            }else{
                System.out.println("Sorry the Stack is Empty");
            }

            return -1;
        }

        public int peek(){
            return arr[top];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public boolean isFull(){
            return (size == capacity);
        }
    }
}
