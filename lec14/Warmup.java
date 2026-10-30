public class Warmup {

    private class Node {
        private Comparable element;
        private Node left;
        private Node right;

        public Node() {
            //init empty tree
            this.left = null;
            this.right = null;
        }

        public Node(Comparable data) {
            this.element = data;
            this.left = null;
            this.right = null;
        }

    }

    //bug fix 
    private static boolean isBST(Node n, Comparable min, Comparable max) {
        if (n == null) return true;

        if (min != null && n.element.compareTo(min) <= 0) return false;
        if (max != null && n.element.compareTo(max) >= 0) return false;

        return isBST(n.left, min, n.element) && isBST(n.right, n.element, max);
    }

    public static boolean isBST(Node n) {
        return isBST(n, null, null);
    }

    public void IOT(Node n) {
        if (n == null) return;
        IOT(n.left);
        System.out.println(n);
        IOT(n.right);
    }
}
