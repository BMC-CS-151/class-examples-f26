import java.util.Queue;
import java.util.LinkedList;

public class Rotate {
    public static String rotate(String[] names, int k) {
        Queue<String> q = new LinkedList<String>();  
        for (int i=0; i<names.length; i++) {
            q.add(names[i]);
        }

        //rotate 
        int i = 0;
        while (i < k) {
            q.add(q.remove());
            i++;
        }

        String out = "";
        while (!q.isEmpty()) {
            out += q.remove() + " "; 
        }

        return out;
    }

    public static void main(String[] args) {
        String[] ppl = {"p1", "p2", "p3", "p4", "p5"};
        System.out.println(rotate(ppl, 3));
    }
}
