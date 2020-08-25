package com.company;

public class Tree {

    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }

    }

    public void preOrderT(){
        if(root != null){
            root.preOrderT();
        }
    }

    public void traverseInOrder() {
        if(root != null){
            root.traverseInOrder();
        }
    }

    public void postOrderT(){
        if(null != root){
            root.postOrderT();
        }
    }
    protected void breadthFirst(){
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++){
            printGivenLevel(root, i);
            System.out.print(+i);
            System.out.println();
            System.out.println();
        }
    }

    int height(TreeNode root){
        if (root == null) {
            return 0;
        }else{
            int lheight = height(root.leftChild);
            int rheight = height(root.rightChild);

            if(lheight > rheight){
                return lheight + 1;
            }else{
                return rheight + 1;
            }
        }
    }

    void printGivenLevel(TreeNode root, int level){
        if (root == null)
            return;
        if (level == 1){
            System.out.println(root.getData() + " " );
        }else if(level > 1){
            printGivenLevel(root.leftChild, level - 1);
            printGivenLevel(root.rightChild, level - 1);
        }
    }

    public TreeNode get(int value){
        if (root != null){
           return root.get(value);
        }
        return null;
    }

    public void delete(int value){
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value){
        if (subtreeRoot == null){
            return null;
        }

        if(value < subtreeRoot.getData()) {
           subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        else if(value > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }else{
            //cases 1 and 2: node to delete has 0 or 1 children
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            }
            else if(subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }

            //Case 3: node to delete has 2 children

            //Replace the value in the subtreeRoot node with the
            //smallest from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            //Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    public int min(){
        if (root == null){
            return  Integer.MIN_VALUE;
        }else {
            return root.min();
        }
    }

    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }else{
            return  root.max();
        }
    }

}
