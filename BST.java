package com.Day15;

class Node {
	int data;
	Node left;
	Node right;
	// create one constructor
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
//main class
public class BST {

	Node root;

	public void add(int data) {
		root = addToNode(root, data);
	}

	private Node addToNode(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;

		}
		if (data < root.data) {
			root.left = addToNode(root.left, data);
		} else if (data > root.data) {
			root.right = addToNode(root.right, data);

		}
		return root;
	}

	public void inOrder() {
		if (root != null) {
			System.out.print("The Binary Tree is : ");

		}
		inOrderByNode(root);
		System.out.println();
	}

	private void inOrderByNode(Node root) {
		if (root != null) {
			inOrderByNode(root.left);
			System.out.print(root.data + " ");
			inOrderByNode(root.right);

		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Binary Search Tree program...");
		//Create one object
		BST tree = new BST();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		
		tree.inOrder();

	}

}
