public class Stack<E> {
    private E[] array; //let's assume a fixed 100,000 size array
    private int top; //keep track of the current top value in the stack

    public Stack() {
        array = (E[]) new Object[100000]; 
        top = -1;
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return size() == array.length;
    }
    public void push(E data) {
        //Case 2: array is full - throw exception 
        if (isFull()) {
            throw new RuntimeException("stack is full");
        }
        //Case 1: array is not full
        //add to the end 
        array[top+1] = data;
        top++;
    }

    public E pop() {
        //Case 1: array is empty
        if (isEmpty()) {
            throw new RuntimeException("cant pop from an empty stack");
        }
        //Case 2: array is non-empty;
        E elem = array[top];
        array[top] = null;
        top--;
        return elem;
    }

    public E peek() {
        //Case 1: array is empty... throw exception;
        if (isEmpty()) {
            throw new RuntimeException("cant pop from an empty stack");
        }

        //Case 2: array is non-empty;
        return array[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        //top = -1, []
        stack.push(10); 
        //top = 0, [10, .....]
        stack.push(20);
        //top = 1, [10,20,.....]
        stack.push(30);
        //top = 2, [10,20,30, ...]

        System.out.println("Top element: " + stack.peek()); //30

        stack.pop();
        //top = 1, [10,20,x30x, ...]
        stack.pop();
        //top = 0, [10,x20x,x30x, ...]

        System.out.println("Top element after popping: " + stack.peek()); //10

        stack.pop();
        System.out.println(stack.isEmpty()); //true
    }
}
