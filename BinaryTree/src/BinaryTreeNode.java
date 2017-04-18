/**
 * Created by ivanmolera on 17/4/17.
 */
public class BinaryTreeNode {

    private Integer nodeValue;
    private BinaryTreeNode leftNode;
    private BinaryTreeNode rightNode;

    BinaryTreeNode(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }


    public Integer getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Integer nodeValue) {
        this.nodeValue = nodeValue;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
