package DSA.Stack_Basic_Problem;

public class Operation_on_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        insert(stack, 6);
        System.out.println(head_of_Stack(stack));

        System.out.println(find(stack, 6));
        
    }

    public static  void insert(Stack stack, int num){
        stack.push(num);
    }

    public static void remove(Stack stack){
        stack.pop();
    }

    public static int head_of_Stack(Stack stack){
        return stack.peek();
    }

    public static boolean find(Stack stack , int num){
        Stack stack2 = new Stack();

        boolean isExist = false;

        while(!stack.isEmpty()){
            if (stack.peek() == num) {
                isExist = true;
                
            }
            stack2.push(stack.pop());
        }

        while(!stack2.isEmpty()){
            stack.push(stack2.pop());
        }

        return isExist;
    }
}
