package DSA.Stack_Basic_Problem;

public class Reverse_array_using_Stack {
    public static void main(String[] args) {
        int n = 5;
        int arr[]= {1,2,3,4,5};
        System.out.print("Original Array ");
        printArray(n, arr);
        arr = reverseArray(n, arr);
        printArray(n, arr);
    }

    public static int[] reverseArray(int n, int arr[]){
        Stack stack = new Stack();

        for(int i=0; i<n; i++){
            stack.push(arr[i]);
        }

        for(int i=0; i<n; i++){
            arr[i] = stack.pop();
        }

        return arr;
    }

    public static void printArray(int n, int arr[]){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");
    }
}
