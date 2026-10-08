public class LinkedBinaryTree <E extends Comparable<E>>  implements BinaryTree<E> {
    private Node root;

    public LinkedBinaryTree() {
        root = null;
    }

    public LinkedBinaryTree(E data) {
        root = new Node(data);
    }

    private class Node {
        private E element;
        private Node left;
        private Node right;

        public Node() {
            //init empty tree
            this.left = null;
            this.right = null;
        }

        public Node(E data) {
            this.element = data;
            this.left = null;
            this.right = null;
        }

    }

    public int height() {
        return -1;
    }

    public void insert(E elem) {

    }

    public int size() {
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(E elem) {
        return containsHelper(elem, this.root);
    }

    private boolean containsHelper(E elem, Node root) {
       if (root.element.equals(elem)) return true;

       if (root.element.compareTo(elem) > 0) {
                return containsHelper(elem, root.left);
         } else { //elem > root
                return containsHelper(elem, root.right);
         }
    }

}
