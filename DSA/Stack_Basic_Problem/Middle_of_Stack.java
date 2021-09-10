package DSA.Stack_Basic_Problem;
public class Middle_of_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        int n = 5;

        System.out.println("Middle of the Stack is "+ middle(n, stack));
    }

    public static int middle(int n, Stack stack){
        int i =0;

        while(i != n/2){
            stack.pop();
            i++;
        }

        return stack.pop();
    }
}
