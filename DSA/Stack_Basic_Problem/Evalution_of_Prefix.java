package DSA.Stack_Basic_Problem;

import java.util.Stack;

public class Evalution_of_Prefix {
    public static void main(String[] args) {
        String str = "+*1023";
        System.out.println("Evalution of this prefix "+evalution(str));
    }

    public static int evalution(String str){
        Stack<Integer> stack = new Stack<>();
        for(int i=str.length()-1; i>=0; i--){
            if (Character.isDigit(str.charAt(i))) {
                stack.push(Integer.parseInt(str.charAt(i)+""));
            }else{
                int op1 = stack.pop();
                int op2 = stack.pop();

                int result = operation(op1, op2, str.charAt(i));
                stack.push(result);
            }

            System.out.println(stack);
        }



        return stack.pop();
    }

    public static int operation(int op1, int op2, char operator){
        switch(operator){
            case '+':
            return op1+op2;

            case '-':
            return op1-op2;

            case '*':
            return op1*op2;

            case '/':
            return op1/op2;

            default:
            System.out.println("Please enter valid operator");

        }

        return -1;
    }
}
