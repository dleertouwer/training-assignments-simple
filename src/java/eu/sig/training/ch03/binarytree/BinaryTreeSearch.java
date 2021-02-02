package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {
    
    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        }
        return traverseBinaryTree(node, nodeValue);
    }
    
    private static int traverseBinaryTree(BinaryTreeNode<Integer> node, int nodeValue) {
        BinaryTreeNode<Integer> childNode = getChildNode(node, nodeValue);
        if(childNode == null) {
            throw new TreeException("Value not found in tree!");
        }
        return 1 + calculateDepth(childNode, nodeValue);
    }
    
    private static BinaryTreeNode<Integer> getChildNode(BinaryTreeNode<Integer> node, int nodeValue) {
        return nodeValue < node.getValue() ? node.getLeft() : node.getRight();
    }


}