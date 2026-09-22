public class Warmup {
    //assume a E[] data class member
    public void moveToFrontArr(E elem) {
        int elemIdx = -1;
        for (int i=0; i<this.data.length; i++) {
            if(this.data[i].equals(elem)) {
                elemIdx = i;
                break;
            }
        }  
        // if(elemIdx == -1) print an err message
        for (int i=elemIdx; i>0; i--) {
            this.data[i] = this.data[i-1];
        }
        this.data[0] = elem;
    }

    //DLL method  - assumes nested Node class 
    // and DLL head and tail
    public void moveToFrontDLL(String data) {
       Node cur = head.next;
       while (!cur.equals(tail)) {
           if (cur.data.equals(data)) {
                //move to front
                break;
           }
            cur = cur.next;
       }
       //cur is pointing to the node to move
        Node prevData = cur.prev; //A
        Node nextData = cur.next; //C

        cur.prev = head;
        cur.next = head.next;

        //old first elemnent is now the second element
        //and its .prev should point to the moved node.
        head.next.prev = cur;
        head.next = cur;
        prevData.next = nextdata;
        nextData.prev = prevData;

    }
}
