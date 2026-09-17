public class DoublyLinkedList<T> {

    private Node head;
    private Node tail; //NOTICE TAIL

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();

        head.next = tail; //In an empty linked list, head and tail point to eachother
        tail.prev = head;
    }

    private class Node<T> {

        public T data;
        public Node next;
        public Node prev;

        public Node() {
            this.next = null;
            this.prev = null;
        }

        public Node(T data) {
            this.data = data;
        }
    }

    //TODO 2: copy over and fix insertHead 
    public void insertHead(T data) {
        Node n = new Node(data);
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }

    public void insertTail(T data) {
        // 1. create a new node
        Node n = new Node(data);
        Node lastElem = tail.prev;
        //update links on the new node first
        n.next = tail;
        n.prev = lastElem;

        lastElem.next = n;
        tail.prev = n;
    }

    public void print() {
        Node currNode = head.next;

        while (currNode != tail) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        DoublyLinkedList<String> dll = new DoublyLinkedList<String>();
        dll.insertHead("A");
        dll.print();
        dll.insertTail("B");
        dll.print();
        dll.insertTail("C");
        dll.print();
    }
}
