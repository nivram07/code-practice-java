public class BinaryTree {

    public static void main(String args[]) {

        TreeNode sample = new TreeNode(7);
        TreeNode.addNode(sample, 1);
        TreeNode.addNode(sample,6);
        TreeNode.addNode(sample, 5);
        TreeNode.addNode(sample, 4);
        TreeNode.addNode(sample, 2);

        System.out.println("Inorder traversal");
        TreeNode.inorder(sample);
        System.out.println("PostOrder traversal");
        TreeNode.postorder(sample);
        System.out.println("PreOrder traversal");
        TreeNode.preorder(sample);
    }

    public static class TreeNode {
        int data;
        TreeNode leftChild = null;
        TreeNode rightChild = null;

        public TreeNode(int data) {
            this.data = data;
        }

        public static void addNode(TreeNode root, int data) {
            if (data <= root.data) {
                if (root.leftChild == null) {
                    root.leftChild = new TreeNode(data);
                } else {
                    addNode(root.leftChild, data);
                }
            } else {
                if (root.rightChild == null) {
                    root.rightChild = new TreeNode(data);
                } else {
                    addNode(root.rightChild, data);
                }
            }
        }

        public static void inorder(TreeNode node) {
            if (node.leftChild != null) {
                inorder(node.leftChild);
            }
            System.out.println(node.data);
            if (node.rightChild != null) {
                inorder(node.rightChild);
            }
        }

        public static void postorder(TreeNode node) {
            if (node.leftChild != null) {
                postorder(node.leftChild);
            }
            if (node.rightChild != null) {
                postorder(node.rightChild);
            }
            System.out.println(node.data);
        }

        public static void preorder(TreeNode node) {
            System.out.println(node.data);
            if (node.leftChild != null) {
                preorder(node.leftChild);
            }
            if (node.rightChild != null) {
                preorder(node.rightChild);
            }
        }
    }

}
