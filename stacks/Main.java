package stacks;

import stacks.stacks.Stack;

public class Main {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(90);
        stack.push(85);
        stack.push(78);
        stack.push(99);
        System.out.println(stack.isUnderflow());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
