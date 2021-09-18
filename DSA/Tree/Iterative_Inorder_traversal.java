package DSA.Tree;

import java.util.Stack;

public class Iterative_Inorder_traversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorder(root);
    }

    public static void inorder(Node root){
        Node curr = root;
        Stack<Node> stack = new Stack<>();
        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
            curr = curr.left;
            }

            curr = stack.pop();
            System.out.print(curr.data +" ");
            curr = curr.right;
        }
    }

    public static class Node{
        int data;
        Node left,right;

        Node(int num){
            data = num;
            left = right = null;
        }
    }
}
