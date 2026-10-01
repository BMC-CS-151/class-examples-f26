public class QueueLL<E> {
    private LinkedList<E> ll;

    public QueueLL() {
        ll = new LinkedList<E>();
    }

    public void enqueue(E elem) {
        ll.insertHead(elem);
    }

    public E dequeue() {
        return ll.removeLastElem();
    }
}
