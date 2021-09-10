package DSA.Stack_Basic;

import java.util.Stack;
public class Balanced_paranthesis {
    public static void main(String[] args) {
        String check = "())";
        System.out.println(isBalanced(check));
    }

    public static boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if (str.charAt(i)=='(' || str.charAt(i) == '{' || str.charAt(i)=='[') {
                stack.push(str.charAt(i));
            }else{
                if (stack.isEmpty()) {
                    return false;
                }else if(matching(stack.peek(), str.charAt(i)) == false){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty());
    }

    public static boolean matching(char a, char b){
        return ((a=='(' && b==')' )||(a=='{' && b=='}')|| (a=='[' && b==']'));
    }
}
