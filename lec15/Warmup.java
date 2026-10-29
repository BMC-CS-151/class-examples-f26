public class Warmup {

    public static class Node {
        private int element;
        private Node left;
        private Node right;

        public Node() {
            //init empty tree
            this.left = null;
            this.right = null;
        }

        public Node(int data) {
            this.element = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int countInRange(Node n, int lo, int hi) {
        if (n == null) return 0; 
        if (n.element > hi) {
            return countInRange(n.left, lo, hi);
        } else if (n.element < lo) {
            return countInRange(n.right, lo, hi);
        }
        //if (n.element >= lo && n.element <= hi)

        return 1 + countInRange(n.left, lo, hi) + countInRange(n.right, lo, hi);
    }

    public static void main(String[] args) {
        Node root = new Node(70);
        root.left = new Node(50);
        root.right = new Node(80);
        root.left.left = new Node(30);
        root.left.right = new Node(60);
        root.right.left = new Node(75);
        root.right.right = new Node(90);

        System.out.println(countInRange(root, 40, 75));

    }

}
