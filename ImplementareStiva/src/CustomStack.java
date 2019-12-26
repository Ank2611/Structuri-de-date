public class CustomStack {

    private int maxSize;
    private int[] myStack;
    private int top;

    public CustomStack(int s) {
        myStack = new int[s];
        top = -1;
    }
    public void push(int j) {
        myStack[++top] = j;
    }
    public int pop() {
        return myStack[top--];
    }
    public int peek() {
        return myStack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }


}
