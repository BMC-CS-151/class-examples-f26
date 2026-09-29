public class QueueArr<E> {
    private E arr[];
    private int front; //first elem at the beginning
    private int back; //first open slot at the end

    public QueueArr() {
        arr = (E[]) new Object[10000]; 
        front = -1;
        back = 0;
    }

    public boolean isEmpty() {
        return front == -1 && back == 0;
    }

    public int size() {
        return back-front;
    }

    public E first() {
        return arr[front];
    }

    public void enqueue(E e) {
        if (front == -1) front = 0;
        arr[back] = e;
        back++;
    }

    public E dequeue() {
        //FIFO
        E elem = arr[front];
        if (size() == 1) { 
            front = -1;
            back = 0;
        } else {
            front += 1;
        }
        arr[front] = null;
        return elem;
    }

    public static void main(String[] args) {

    }

}
