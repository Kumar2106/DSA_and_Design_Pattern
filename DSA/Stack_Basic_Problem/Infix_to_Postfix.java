package DSA.Stack_Basic_Problem;
import java.util.Stack;
public class Infix_to_Postfix {
public static void main(String[] args) {
    String str = " A*(B+C)/D";
    System.out.println("Before conversion"+ str);

    str = infixToPostFix(str);
    System.out.println("After conversion" + str);
}

public static String infixToPostFix(String str){
    //initializing empty string 
    String result = new String("");

    //initializing empty stack
    Stack<Character> stack = new Stack();

    for(int i=0; i<str.length(); i++){
        char c = str.charAt(i);

        //if the scanned character is character or digit
        if (Character.isLetterOrDigit(c)) {
            result+=c;
        }

        else if(c=='('){
            stack.push('(');
        }else if (c == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
                result+=stack.pop();
            }

        }else{
            while (!stack.isEmpty() && prec(c)<= prec(stack.peek()) ) {
                result += stack.pop();
            }
            stack.push(c);
        }
    }

    while (!stack.isEmpty()) {
        if (stack.peek() == '(') {
            return "Invalid Expression";
        }
        result+=stack.pop();
    }

    return result;
}

public static int prec(char ch){
    switch (ch) {
        case '+':
        case '-':
        return 1;

        case '*':
        case '/':
        return 2;

        case '^':
        return 3;
    
        default:
         return -1;
    }
}

}
