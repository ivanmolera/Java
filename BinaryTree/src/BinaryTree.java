import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ivanmolera on 17/4/17.
 */
public class BinaryTree {

    private BinaryTreeNode rootNode;

    public ArrayList<Integer> getPreOrder() {
        return getPreOrder(this.rootNode);
    }

    public ArrayList<Integer> getInOrder() {
        return getInOrder(this.rootNode);
    }

    public ArrayList<Integer> getPostOrder() {
        return getPostOrder(this.rootNode);
    }

    public ArrayList<Integer> getLevelOrder() {
        return getLevelOrder(this.rootNode);
    }

    public ArrayList<Integer> getReverseLevelOrder() {
        return getReverseLevelOrder(this.rootNode);
    }

    private ArrayList<Integer> getPreOrder(BinaryTreeNode node) {

        ArrayList<Integer> nodeList = new ArrayList<>();

        if(node != null) {
            nodeList.add(node.getNodeValue());
            nodeList.addAll(getPreOrder(node.getLeftNode()));
            nodeList.addAll(getPreOrder(node.getRightNode()));
        }

        return nodeList;
    }

    private ArrayList<Integer> getInOrder(BinaryTreeNode node) {

        ArrayList<Integer> nodeList = new ArrayList<>();

        if(node != null) {
            nodeList.addAll(getInOrder(node.getLeftNode()));
            nodeList.add(node.getNodeValue());
            nodeList.addAll(getInOrder(node.getRightNode()));
        }

        return nodeList;
    }

    private ArrayList<Integer> getPostOrder(BinaryTreeNode node) {

        ArrayList<Integer> nodeList = new ArrayList<>();

        if(node != null) {
            nodeList.addAll(getPostOrder(node.getLeftNode()));
            nodeList.addAll(getPostOrder(node.getRightNode()));
            nodeList.add(node.getNodeValue());
        }

        return nodeList;
    }

    private ArrayList<Integer> getLevelOrder(BinaryTreeNode node) {

        ArrayList<Integer> nodeList = new ArrayList<>();
        Queue<BinaryTreeNode> nodes = new LinkedList<>();

        nodes.add(node);

        while(!nodes.isEmpty()) {
            BinaryTreeNode btn = nodes.poll();

            nodeList.add(btn.getNodeValue());

            if(btn.getLeftNode() != null) {
                nodes.add(btn.getLeftNode());
            }
            if(btn.getRightNode() != null) {
                nodes.add(btn.getRightNode());
            }
        }

        return nodeList;
    }

    private ArrayList<Integer> getReverseLevelOrder(BinaryTreeNode node) {

        ArrayList<Integer> nodeList = new ArrayList<>();
        Queue<BinaryTreeNode> nodes = new LinkedList<>();

        nodes.add(node);

        while(!nodes.isEmpty()) {
            BinaryTreeNode btn = nodes.poll();

            nodeList.add(btn.getNodeValue());

            if(btn.getRightNode() != null) {
                nodes.add(btn.getRightNode());
            }
            if(btn.getLeftNode() != null) {
                nodes.add(btn.getLeftNode());
            }

        }

        Collections.reverse(nodeList);

        return nodeList;
    }

    public void setRootNode(BinaryTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public void addLeftNode(BinaryTreeNode parent, BinaryTreeNode leaf) {
        parent.setLeftNode(leaf);
    }

    public void addRightNode(BinaryTreeNode parent, BinaryTreeNode leaf) {
        parent.setRightNode(leaf);
    }
}
