public class LinkedList<T> {

  private Node head;
  private int numElems;

  public LinkedList() {
    head = new Node();
    numElems = 0;
  }
  //TODO: Constructor 

  private class Node<T> {
    public T data;
    public Node next;

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Node(T data) {
      this.data = data;
    }
  }

  public Node find(T data) {
      Node cur = head.next;
      while (cur != null) {
        if (cur.data.equals(data)) {
            return cur;
        }
        cur = cur.next;
      }
      return null;
  }

  public void insertHead(T data) {
    // 1. Create new node
    Node n = new Node(data);
    // 2. have new node next point to first element
    n.next = head.next;
    // 3. update the head to point to the new node
    head.next = n;
  }

  public void insertTail(T data) {
    // 1. create a new node
    Node n = new Node(data);
    if (head.next == null) {
        head.next = n;
        return;
    }
    // 2. find the last node
    Node cur = head.next;
    while (cur.next != null) {
        cur = cur.next;
    }
    // 3. make the last node point to newest
    cur.next = n;
  }


  public void print() {
    Node currNode = head.next;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.print();

    list.insertTail(0);
    list.print();
    list.insertTail(1);
    list.print();
    list.insertHead(2);
    list.print();
  }

}
