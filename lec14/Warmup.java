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

    public static boolean isBST(Node n) {
            if (n == null) return true; 
            if (n.left != null && n.left.element.compareTo(n.element) > 0) {
                return false;
            }
            if (n.right != null && n.right.element.compareTo(n.element) < 0) {
                return false;
            }
            return isBST(n.left) && isBST(n.right);
    }

    public void IOT(Node n) {
        if (n == null) return;
        IOT(n.left);
        System.out.println(n);
        IOT(n.right);
    }
}
