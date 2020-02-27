package code.practice.datastructure;

public class BinaryTreeDemo {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(10);

        binaryTree.insert(7);
        binaryTree.insert(5);
        binaryTree.insert(6);
        binaryTree.insert(15);
        binaryTree.insert(12);
        binaryTree.insert(14);

        binaryTree.printInOrderTraversal();
        System.out.println("");
        binaryTree.printPreOrderTraversal();
        System.out.println("");
        binaryTree.printPostOrderTraversal();
    }
}
