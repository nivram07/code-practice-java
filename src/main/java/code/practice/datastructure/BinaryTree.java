package code.practice.datastructure;

public class BinaryTree {

    private TreeNode root;

    public BinaryTree(int rootValue) {
        this.root = new TreeNode(rootValue);
    }

    public void insert(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
        } else {
            insertNode(this.root, value);
        }
    }

    private void insertNode(TreeNode source, int valueToInsert) {
        if (valueToInsert == source.value) {
            System.out.println("Duplicates not allowed. " + valueToInsert + " is already in the tree.");
        } else if (valueToInsert < source.value) {
            if (source.left != null) {
                insertNode(source.left, valueToInsert);
            } else {
                source.left = new TreeNode(valueToInsert);
            }
        } else {
            if (source.right != null) {
                insertNode(source.right, valueToInsert);
            } else {
                source.right = new TreeNode(valueToInsert);
            }
        }
    }

    public void printInOrderTraversal() {
        TreeNode iteratorNode = root;
        inOrderTraversal(iteratorNode);
    }

    public void printPreOrderTraversal() {
        TreeNode iteratorNode = root;
        preOrderTraversal(iteratorNode);
    }

    public void printPostOrderTraversal() {
        TreeNode iteratorNode = root;
        postOrderTraversal(iteratorNode);
    }

    private void inOrderTraversal(TreeNode node) {
        if (node.left != null) {
            inOrderTraversal(node.left);
        }
        System.out.print(node.value + " ");
        if (node.right != null) {
            inOrderTraversal(node.right);
        }
    }

    private void preOrderTraversal(TreeNode node) {
        System.out.print(node.value + " ");
        if (node.left != null) {
            preOrderTraversal(node.left);
        }
        if (node.right != null) {
            preOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(TreeNode node) {
        if (node.left != null) {
            postOrderTraversal(node.left);
        }
        if (node.right != null) {
            postOrderTraversal(node.right);
        }
        System.out.print(node.value + " ");
    }

}
