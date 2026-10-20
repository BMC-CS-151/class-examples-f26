public class LL {
    Node head;
    Node tail; 
    //Node class here
    
    public void rearrangeEvenOdd() {
        Node e = head.next;
        Node o = e.next;
        Node oddHead = o;
        //while (e.next != null && o.next != null) {
        while (e.next != tail && o.next != tail) {
            e.next = e.next.next;
            o.next = o.next.next;

            e = e.next;
            o = o.next;
        }
        e.next = oddHead;
    }
}
