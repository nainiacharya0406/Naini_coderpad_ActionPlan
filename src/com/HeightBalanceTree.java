package com;

public class HeightBalanceTree {
	Node root;

	public static void main(String[] args) {
		HeightBalanceTree tree = new HeightBalanceTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5);
        System.out.println(checkBalance(tree.root));

	}

	private static Boolean checkBalance(Node root) {
		if (root == null) {
			return true;
		}
             
		int heightL = height(root.left);
		int heightR = height(root.right);
		if((Math.abs(heightR-heightL) <= 1) && checkBalance(root.left) && checkBalance(root.right)) {
			return true;
		}
		return false;
		
	}

	private static int height(Node node) {
		if (node == null) {
			return 0;
		}
             
		return 1 + Math.max(height(node.left), height(node.right));
	}

}
