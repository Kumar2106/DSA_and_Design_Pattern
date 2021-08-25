package DesignPattern;

public class Example {
   static InnerExample example = new Example1();
    public static void main(String[] args) {
        example.add();
    }
}

/**
 * InnerExample
 */
 interface InnerExample {
    public void add();
    
}

class Example1 implements InnerExample{
    public void add(){
        System.out.print("adding");
    }
}