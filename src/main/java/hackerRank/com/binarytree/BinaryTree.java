package hackerRank.com.binarytree;

public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (this.root == null) {
			
			this.root = newNode;
			
		} else {
			Node focusNode = root;
		
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node

			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}

	}

	public Node findNode(int key) {

		// Start at the top of the tree

		Node focusNode = root;

		// While we haven't found the Node
		// keep looking
		while (focusNode.key != key) {

			// If we should search to the left
			if (key < focusNode.key) {
				// Shift the focus Node to the left child
				focusNode = focusNode.leftChild;
			} else {
				// Shift the focus Node to the right child
				focusNode = focusNode.rightChild;
			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}
		return focusNode;

	}
	
	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, "Boss");

		theTree.addNode(25, "Vice President");

		theTree.addNode(15, "Office Manager");

		theTree.addNode(30, "Secretary");

		theTree.addNode(75, "Sales Manager");

		theTree.addNode(85, "Salesman 1");

		// Different ways to traverse binary trees

		 //theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		System.out.println("\nNode with the key 75");

		System.out.println(theTree.findNode(80));

		/*System.out.println("Remove Key 25");

		theTree.remove(25);

		System.out.println(theTree.findNode(25));

		theTree.inOrderTraverseTree(theTree.root);
*/
	}
}
