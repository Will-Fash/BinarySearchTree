package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = 20;
        numbers[2] = 15;
        numbers[3] = 27;
        numbers[4] = 30;
        numbers[5] = 29;
        numbers[6] = 26;
        numbers[7] = 22;
        numbers[8] = 32;
        numbers[9] = 17;

        double w = 1.0;
        double v = 0.9;

        System.out.println(w - v);
        System.out.println("\n");

        Tree intTree = new Tree();

        for (int i = 0; i < numbers.length; i++) {
            intTree.insert(numbers[i]);
        }

        intTree.traverseInOrder();
        System.out.println();


        intTree.delete(8888);
        intTree.traverseInOrder();
        System.out.println();
        System.out.println();
        intTree.postOrderT();
        System.out.println();
        System.out.println();
        intTree.preOrderT();
        //intTree.breadthFirst();
    }
}
