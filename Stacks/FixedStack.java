package stacks_adt.practice;

public class FixedStack {
    //Default array capacity.
    public static final int CAPACITY = 10;
    // Length of the array used to implement the stack.
    protected int capacity;
    //Array used to implement the stack.
    protected int[] stackRep;
    //Index of the top element of the stack in the array.
    protected int top = -1;

    //Initializes the stack to use an array of default length.
    public FixedStack() {
        capacity = CAPACITY;//default capacity
    }

    //Initializes the stack to use an array of given length.
    public FixedStack(int cap) {
        capacity = cap;
        stackRep = new int[capacity];// compiler may give warning, but this is ok.
    }

    //Return the number of elements in the stack. This method runs in O(1) time.
    public int size() {
        return (top + 1);
    }

    //Testes whether the stack is empty. This method runs in O(1) time.
    public boolean isEmpty() {
        return (top < 0);
    }

    //Insert an element at the top of the stack. This methods runs in O(1) time.
    public void push(int data) throws Exception {
        if (size() == capacity)
            throw new Exception("Stack is full");
        stackRep[++top] = data;
    }

    //Inspect the element at the top of the stack. THis method runs in O(1) time.
    public int top() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty");
        return stackRep[top];
    }

    //Removes the top element from the stack. Time O(1)
    public int pop() throws Exception {
        int data;
        if (isEmpty())
            throw new Exception("Stack is empty");
        data = stackRep[top];
        stackRep[top--] = Integer.MAX_VALUE;
        return data;
    }

    //Returns a string representation of the stack as a list of elements, with
    //the top element at the end: [.., prev, top ]. This method runs in O(n)
    //time, where n is the size of the stack.
    public String toString() {
        String s;
        s = "[";
        if (size() > 0)
            s += stackRep[0];
        if (size() > 1)
            for (int i = 1; i <= size() - 1; i++) {
                s += "," + stackRep[i];
            }
        return s + "]";
    }
}
