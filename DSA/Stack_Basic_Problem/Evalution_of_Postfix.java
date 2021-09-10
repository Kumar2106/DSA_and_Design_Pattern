package DSA.Stack_Basic_Problem;

import java.util.Stack;

public class Evalution_of_Postfix {
    public static void main(String[] args) {
        String str ="123+*8-";
        System.out.println(evalution(str));
    }

    public static int evalution(String str){
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                stack.push(Integer.parseInt(str.charAt(i)+""));
            }else{
                int op1 = stack.pop();
                int op2 = stack.pop();
                int result = operation(op2, op1, str.charAt(i));
                stack.push(result);
            }

            System.out.println(stack);
        }
        return stack.pop();
    }

    public static int operation(int op1, int op2, char operation){
        switch(operation){
            case '+':
            return op1+op2;

            case '-':
            return op1-op2;

            case '*':
            return op1*op2;

            case '/':
            return op1/op2;

            default:
            System.out.println("Input the valid operator");
        }
        return -1;
    }
}
