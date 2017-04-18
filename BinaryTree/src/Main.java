import java.util.ArrayList;

/**
 * Created by ivanmolera on 17/4/17.
 */
public class Main {

    public static void main(String[] args) {

        BinaryTree tree = createBinaryTree();

        ArrayList<Integer> preOrderNodeList = tree.getPreOrder();
        System.out.println("PreOrder:\t" + preOrderNodeList);

        ArrayList<Integer> inOrderNodeList = tree.getInOrder();
        System.out.println("InOrder:\t" + inOrderNodeList);

        ArrayList<Integer> postOrderNodeList = tree.getPostOrder();
        System.out.println("PostOrder:\t" + postOrderNodeList);

        ArrayList<Integer> levelOrderNodeList = tree.getLevelOrder();
        System.out.println("LevelOrder:\t" + levelOrderNodeList);

        ArrayList<Integer> reverseLevelOrderNodeList = tree.getReverseLevelOrder();
        System.out.println("ReverseLevelOrder:\t" + reverseLevelOrderNodeList);
    }

    private static BinaryTree createBinaryTree() {
        BinaryTreeNode root  = new BinaryTreeNode(40);
        BinaryTreeNode node1 = new BinaryTreeNode(20);
        BinaryTreeNode node2 = new BinaryTreeNode(60);
        BinaryTreeNode node3 = new BinaryTreeNode(10);
        BinaryTreeNode node4 = new BinaryTreeNode(30);
        BinaryTreeNode node5 = new BinaryTreeNode(50);
        BinaryTreeNode node6 = new BinaryTreeNode(70);

        BinaryTree tree = new BinaryTree();

        tree.setRootNode(root);

        tree.addLeftNode(root, node1);
        tree.addRightNode(root, node2);

        tree.addLeftNode(node1, node3);
        tree.addRightNode(node1, node4);

        tree.addLeftNode(node2, node5);
        tree.addRightNode(node2, node6);

        return tree;
    }
}
