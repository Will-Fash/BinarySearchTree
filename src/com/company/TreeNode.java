package com.company;

public class TreeNode {

    private int data;
    protected TreeNode leftChild;
    protected TreeNode rightChild;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value == data){
            return;
        }

        if (value < data){
            if(leftChild == null){
                leftChild = new TreeNode(value);
            }else {
                leftChild.insert(value);
            }
        }else {
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else {
                rightChild.insert(value);
            }
        }
    }

    protected void preOrderT(){
        System.out.println(data + ", ");
        if(leftChild != null){
            leftChild.preOrderT();
        }
        if(rightChild != null){
            rightChild.preOrderT();
        }
    }

    protected void postOrderT(){
        if(null != leftChild){
            leftChild.postOrderT();
        }
        if(null != rightChild){
            rightChild.postOrderT();
        }

        System.out.println(data + ", ");

    }

    public TreeNode get(int value){
        if(value == data){
            return this;
        }

        if(value < data){
            if(leftChild != null){
                return leftChild.get(value);
            }
        }else {
            if(rightChild != null){
                return rightChild.get(value);
            }
        }
        return null;
    }


    public void traverseInOrder(){
       if(leftChild != null){
           leftChild.traverseInOrder();
       }
       System.out.print(data + ", ");
       if(rightChild != null){
           rightChild.traverseInOrder();
       }
    }

    public int min(){
        if(leftChild == null){
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public int max(){
      if(rightChild == null){
          return data;
      }else {
          return rightChild.max();
      }
    }

    public int getData() {
        return data;
    }

   /* public int getNtimes() {
        return ntimes;
    }

    public void setNtimes(int ntimes) {
        this.ntimes = ntimes;
    }*/

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
