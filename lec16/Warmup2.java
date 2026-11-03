public class Warmup2 {
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

    public static int countLessThan(Node n, int x) {
        if (n == null) return 0;
        
        if (n.element < x) {
            return 1 + countLessThan(n.left, x) + countLessThan(n.right, x);
        } else {
            return countLessThan(n.left, x) + countLessThan(n.right, x);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(80);
        root.right = new Node(70);
        root.left.left = new Node(72);
        root.left.right = new Node(3);
        root.right.left = new Node(2);
        root.right.right = new Node(50);
        root.left.left.left = new Node(61);

        //should be 5
        System.out.println(countLessThan(root, 71));

    }

}
