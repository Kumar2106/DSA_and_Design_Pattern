package DSA.Stack_Basic_Problem;

public  class Stack{
    Node head;
    int size;

    public Stack(){
        head = null;
        size =0;
    }

    public void push(int num){
        Node iNode = new Node(num);
        if (head == null) {
            head = iNode;
            size++;
            return;
        }

        iNode.next = head;
        head = iNode;
        size++;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int num = head.data;
        head = head.next;
        size--;
        return num;
    }

    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return head.data;
    }

    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }
}

//Node class
  class Node{
    int data;
    Node next;

    Node(int num){
        this.data = num;
        next = null;
    }
}
