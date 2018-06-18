package datastructures.examples.binaryTree;

public class Node {
	int key;
	String name;
	int data;
	int   height;

	Node left;
	Node right;

	public Node(int key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public Node(int key, int data, String name) {
		this.key = key;
		this.name = name;
		this.data = data;
	}

	@Override
	public String toString() {

		return name + " has a key " + key;
	}
}