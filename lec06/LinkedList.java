public class LinkedList<T> {

  private Node head;
  private int numElems;

  public LinkedList() {
    head = new Node();
    numElems = 0;
  }

  private class Node {
    public T data;
    public Node next;

    public Node() {
      this.data = null;
      this.next = null;
    }

    public Node(T data) {
      this.data = data;
      this.next = null;
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

  public void swapEnds() {
      Node first = head.next;
      Node second = first.next;
     
     head.next = second; 
     first.next = second.next;
     second.next = first;

     Node cur = head.next;
     while (cur.next.next.next != null) {
        cur = cur.next; 
     }

     Node thirdToLast = cur;
     Node secondToLast = thirdToLast.next;
     Node last = secondToLast.next;

     thirdToLast.next = last;
     last.next = secondToLast;
     secondToLast.next = null; 
  }

  public void print() {
    Node currNode = head.next;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println();
  }

  public static boolean areEqual(LinkedList.Node list1, LinkedList.Node list2) {

      LinkedList.Node cur1  = list1.next;
      LinkedList.Node cur2 = list2.next;

      while  (cur1 != null && cur2 != null) {
            if (!cur1.data.equals(cur2.data)) {
                return false;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
      }

      return cur1 == null && cur2 == null;
  }

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.insertHead("A");
    list.insertTail("B");
    list.insertTail("C");
    list.insertTail("D");
    list.print();

    list.swapEnds();
    list.print();
  }

}
