import java.util.Random;
public class IsHeap {

    public static class Node {
        int elem;
        Node right;
        Node left;
    }

    public static boolean isMinHeap(Integer[] heap) {
        //min heap: 1 -> completeness; 2-> value ordering
        int numElems = 0;
        for (int i=0; i<heap.length-1; i++) {
            if (heap[i] == null && heap[i+1] != null) return false;
            if (heap[i] != null) numElems += 1;
        }

       for (int i=0; i<numElems; i++) {
            int cur = heap[i];
            int lindex = 2*i + 1;
            int rindex = 2*i + 2;
            if (lindex < numElems && cur > heap[lindex]) return false;
            if (rindex < numElems && cur > heap[rindex]) return false;
       } 

       return true;
    }

    public static boolean isMinHeap(Node node) {
        if (node == null) return true;
        if (node.left != null && node.elem > node.left.elem) return false;
        if (node.right != null && node.elem > node.right.elem) return false;

        return isMinHeap(node.left) && isMinHeap(node.right);    
    }

    public static boolean isComplete(Node node)  {
        if (node == null) return true;
        if (node.right != null && node.left == null) return false;
        boolean leftIsComplete = isComplete(node.left) 
        boolean rightIsComplete = isComplete(node.right);
        
        if (num nodes left subtree < num nodes right subtree)  return false;
        if (num nodes left subtree == 1 and num nodes right subtree == 1) return false;
        else: return true;
    }

    public static void printArray(Integer[] arr) {
        System.out.print("[");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Random rng = new Random();
        int itr =0;
        boolean isHeap = false;
        while (!isHeap) {
            int arrSize = rng.nextInt(25);
            //int numElems = 2 + rng.nextInt(arrSize);

            System.out.println("size: " + arrSize);
            //System.out.println("num elems: " + numElems);
        
            Integer[] rand = new Integer[arrSize];
            for (int i=0; i<arrSize; i++) {
                boolean shouldInsert = rng.nextInt() % 2 == 0;
                //int numElems = 2 + rng.nextInt(arrSize);
                if (shouldInsert) rand[i] = rng.nextInt();
            }

            isHeap = isMinHeap(rand);
            itr += 1;
        }
    }
}
