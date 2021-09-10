package DSA.Stack_Basic_Problem;


public class Insert_in_Stack {
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5};
        Stack stack = insertIntoStack(n, arr);
        printStack(stack);
    }

    public static Stack insertIntoStack(int n, int arr[]){
         
        Stack stack = new Stack();

        for(int i=0; i<n; i++){
            stack.push(arr[i]);
        }

        return stack;

    }

    public static void printStack(Stack stack){
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

        System.out.println(" ");
    }
}
