package gr.aueb.cf.ch14.model;

public class StackManager {

    private final static StackManager INSTANCE = new StackManager();
    private final int[] stack ;
    private int top ;

    private StackManager() {
        stack = new int[100];
        top = -1;
    }

    public static StackManager getInstance() {
        return INSTANCE;
    }

    public void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The array is empty");
        }
        return stack[top--];
    }


    private boolean isFull() {
        return top == stack.length - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void traverseStack() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
