package materia.controllers;

import materia.models.Node;


public class BinaryTree {

    private Node root;
    private int peso = 0;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRec(root, value);
        peso ++;
    }

    private Node insertRec(Node padre, int value) {
        if (padre == null) {
            return new Node(value);
        }
        if (value <= padre.getValue()) {
            padre.setLeft(insertRec(padre.getLeft(), value));
        } else if (value > padre.getValue()) {
            padre.setRight(insertRec(padre.getRight(), value));
        }
        return padre;
    }

    public void printInOrden() {
        printInOrdenRec(root);
    }

    private void printInOrdenRec(Node node) {
        if(node != null) {
            printInOrdenRec(node.getLeft());
            System.out.print(node.getValue() + ", ");
            printInOrdenRec(node.getRight());
        }
    }
    
    public void printPosOrden() {
        printPosOrdenRec(root);
    }

    private void printPosOrdenRec(Node node) {
        if(node != null) {
            printPosOrdenRec(node.getLeft());
            printPosOrdenRec(node.getRight());
            System.out.print(node.getValue() + ", ");
        }
    }

    public void printPreOrden() {
        printPreOrdenRec(root);
    }

    private void printPreOrdenRec(Node node) {
        if(node != null) {
            System.out.print(node.getValue() + ", ");
            printPreOrdenRec(node.getLeft());
            printPreOrdenRec(node.getRight());
        }
    }

    public boolean findValue(int value) {
        return findValueRec(root, value);
    }

    private boolean findValueRec(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.getValue() == value) {
            return true;
        }
        return findValueRec(node.getLeft(), value) || findValueRec(node.getRight(), value);
    }

    private int getHeightTreeRec(Node node) {
        if (node == null) {
        return 0;
    }
        int leftHeight = getHeightTreeRec(node.getLeft());
        int rightHeight = getHeightTreeRec(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
}


    public void printInOrdenWithHeight() {
        printInOrdenWithHeightRec(root);
    }

    private void printInOrdenWithHeightRec(Node node) {
        if(node != null) {
            printInOrdenWithHeightRec(node.getLeft());
            int height = getHeightTreeRec(node);
            System.out.print(node.getValue() + "(h=" + height + "),");
            printInOrdenWithHeightRec(node.getRight());
        }
    }

    public int getBalanceFactor(Node node) {
        if(node == null) {
            return 0;
        } 
        return getHeightTreeRec(node.getLeft()) - getHeightTreeRec(node.getRight());
    }

    public void printInOrdenWithBalanceFactor() {
        printInOrdenWithBalanceFactorRec(root);
    }

    private void printInOrdenWithBalanceFactorRec(Node node) {
        if (node != null) {
            printInOrdenWithBalanceFactorRec(node.getLeft());
            int balanceFactor = getBalanceFactor(node); 
            System.out.print(node.getValue() + "(bf=" + balanceFactor + "), ");
            printInOrdenWithBalanceFactorRec(node.getRight());
        }
    }
    
    public int getSize() {
        return peso;
    }
    
    public int getHeight() {
        return getHeightTreeRec(root);
    }

    public boolean isBalanced() {
        return isBalancedRec(root);
    }

    private boolean isBalancedRec(Node node) {
        if (node == null) {
            return true;
        }
        int balanceFactor = getBalanceFactor(node);
        if (Math.abs(balanceFactor) > 1) {
            return false;
        }
        return isBalancedRec(node.getLeft()) && isBalancedRec(node.getRight());
    }

    public void printUnbalancedNodes() {
        printUnbalancedNodesRec(root);
    }

    private void printUnbalancedNodesRec(Node node) {
        if (node != null) {
            printUnbalancedNodesRec(node.getLeft());
            int bf = getBalanceFactor(node);
            if (Math.abs(bf) > 1) {
                System.out.print(node.getValue() + "(fE = " + bf + ") ");
            }
            printUnbalancedNodesRec(node.getRight());
        }
    }


}
