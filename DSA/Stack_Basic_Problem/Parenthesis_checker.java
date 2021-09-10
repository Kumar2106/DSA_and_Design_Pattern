package DSA.Stack_Basic_Problem;

import java.util.Stack;

public class Parenthesis_checker {
    public static void main(String[] args) {
        String x = "()";
        System.out.println("The given parenthesis is  balanced "+isPair(x));
    }

    public static boolean isPair(String str){
      Stack<Character> stack = new Stack<>();

      for(int i=0; i<str.length(); i++){
          if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
              stack.push(str.charAt(i));
          }else{
              if (stack.peek() == '(' && str.charAt(i)==')' || stack.peek() == '{' && str.charAt(i) =='}' || stack.peek()=='[' && str.charAt(i)==']') {
                  stack.pop();
              }
          }
      }

      return stack.isEmpty();
    }
}
