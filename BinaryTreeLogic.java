package assignments259.dsbinarysearchtree;

public class BinaryTreeLogic<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecusively(root, key);
    }

    private MyBinaryNode<K> addRecusively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);

        if (compareResult == 0) return current;

        if (compareResult < 0) {
            current.left = addRecusively(current.left, key);
        } else {
            current.right = addRecusively(current.right, key);
        }

        return current;
    }

    public void displayNode() {
        displayNode(this.root);
    }

    public void displayNode(MyBinaryNode<K> root) {
        if (root == null) {
            return;
        }
        displayNode(root.left);
        System.out.print(root.key + " ");
        displayNode(root.right);
    }
}
