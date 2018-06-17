package datastructures.examples.binaryTree;

public class BinaryTreeMain {

	public static void main(String[] args) {

		BinaryTree theTree = new BinaryTree();

		theTree.addNode(50, 50, "Boss");

		theTree.addNode(25, 25, "Vice President");

		theTree.addNode(15, 15,  "Office Manager");

		theTree.addNode(30, 30, "Secretary");

		theTree.addNode(75, 75, "Sales Manager");

		theTree.addNode(85, 85, "Salesman 1");
		
		theTree.root.left.left = new Node(35, 35, "Teste");

		// Different ways to traverse binary trees

		//theTree.inOrderTraverseTree(theTree.root);

		// theTree.preorderTraverseTree(theTree.root);

		// theTree.postOrderTraverseTree(theTree.root);

		// Find the node with key 75

		/*System.out.println("\nNode with the key 75");

		System.out.println(theTree.findNode(75));

		System.out.println("Remove Key 75");

		theTree.remove(75);

		System.out.println(theTree.findNode(75));

		theTree.inOrderTraverseTree(theTree.root);
		*/
		System.out.println(theTree.isValidBST());
	}
}
