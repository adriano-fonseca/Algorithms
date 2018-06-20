package datastructures.examples.binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTree {

	Node root;
	
	// To keep tract of previous node in In order Traversal
    Node prev;

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
					focusNode = focusNode.left;

					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	
	public int getDepth(){
		return depth(this.root, 0);
	}
	
	private int depth(Node root, int depth) {
		if(root==null) return 0;
		int depthLeft = this.depth(root.left, depth);
		int depthRight = this.depth(root.right, depth);
		return Math.max(depthLeft, depthRight) + 1;
	}
	
	private Node rotateWithLeftChild(Node k2)
    {
        System.out.println("Left Rotation Performed");
        Node k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
        k1.height = Math.max(height(k1.left), k2.height) + 1;
        return k1;
    }
	
	private int height(Node t){
	 
	        return t == null ? -1 : t.height;
	}
 
    private Node rotateWithRightChild(Node k1)
    {
        //System.out.println("Right Rotation Performed");
    	Node k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
        k2.height = Math.max(height(k2.right), k1.height) + 1;
        return k2;
    }

    
    public Integer[] getArrayFormat(){
     	return extractValues(this.root).toArray(new Integer[] {});
    }
    
    
    private static List<Integer> extractValues(Node n) {
        List<Integer> result = new ArrayList<>();
        result.add(n.data);
        
        if (n.left != null) {
            result.addAll(extractValues(n.left));
        }

        if (n.right != null) {
            result.addAll(extractValues(n.right));
        }

        
        return result;
    }
    
    
    public void printTree2() {

		// Number of spaces between items in tree

		int spaces = 0;

		int iteration = 1;

		// Generate all of the indents that are
		// needed depending on the number of rows
		// to print
		int rows = this.getDepth();

		int[] indent = getIndentArray(this.getDepth());

		while (iteration <= rows) {

			// Find first Index : .5 * (-2 + 2^n)

			int indexToPrint = (int) (.5 * (-2 + (Math.pow(2, iteration))));

			// Number of Items per Row : 2^(n - 1)

			int itemsPerRow = (int) (Math.pow(2, iteration - 1));

			int maxIndexToPrint = indexToPrint + itemsPerRow;

			// Print the indents needed

			for (int j = 0; j < indent[iteration - 1]; j++)
				System.out.print(" ");

			// Print all of the index values for each row
			// indexToPrint represents the first index in the
			// row, while maxIndexToPrint equals the last

			for (int l = indexToPrint; l < maxIndexToPrint; l++) {

				// If the array isn't full don't try to print
				// indexes that don't exist
				//TODO: retornar numeros de nos
				if (l < 7) {

					System.out.print(String.format("%02d", this.getArrayFormat()[l]));

					for (int k = 0; k < spaces; k++)
						System.out.print(" ");

				}

			}

			// In a tree the spaces get bigger in the
			// same way that indents get smaller

			spaces = indent[iteration - 1];

			iteration++;

			System.out.println();

		}

	}

	// Calculate each indent per row for the tree
	// then reverse their order to go from biggest
	// to smallest

	public int[] getIndentArray(int rows) {

		int[] indentArray = new int[rows];

		for (int i = 0; i < rows; i++) {

			indentArray[i] = (int) Math.abs((-2 + (Math.pow(2, i + 1))));

		}

		Arrays.sort(indentArray);

		indentArray = reverseArray(indentArray);

		return indentArray;

	}

	// Reverse the indent values in the array
	// so that they go from biggest to smallest

	public int[] reverseArray(int[] theArray) {

		// Index of the first element
		int leftIndex = 0;

		// Index of last element
		int rightIndex = theArray.length - 1;

		while (leftIndex < rightIndex) {
			// Exchange the left and right elements
			int temp = theArray[leftIndex];
			theArray[leftIndex] = theArray[rightIndex];
			theArray[rightIndex] = temp;

			// Move the indexes to check towards the middle
			leftIndex++;
			rightIndex--;
		}

		return theArray;
	}
    
	public void addNode(int key, int data, String name) {

		Node newNode = new Node(key, data, name);

		if (this.root == null) {

			this.root = newNode;
			
		} else {
			Node focusNode = root;
		
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.left;

					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						parent.right = newNode;
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

			inOrderTraverseTree(focusNode.left);

			// Visit the currently focused on node

			System.out.println(focusNode);

			// Traverse the right node

			inOrderTraverseTree(focusNode.right);

		}

	}

	public void preorderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.left);
			preorderTraverseTree(focusNode.right);

		}

	}

	public void postOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			postOrderTraverseTree(focusNode.left);
			postOrderTraverseTree(focusNode.right);
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
				focusNode = focusNode.left;
			} else {
				// Shift the focus Node to the right child
				focusNode = focusNode.right;
			}

			// The node wasn't found

			if (focusNode == null)
				return null;

		}
		return focusNode;

	}
	
	public boolean remove(int key) {

		// Start at the top of the tree

		Node focusNode = root;
		Node parent = root;

		// When searching for a Node this will
		// tell us whether to search to the
		// right or left

		boolean isItALeftChild = true;

		// While we haven't found the Node
		// keep looking

		while (focusNode.key != key) {
			parent = focusNode;

			// If we should search to the left
			if (key < focusNode.key) {
				isItALeftChild = true;

				// Shift the focus Node to the left child
				focusNode = focusNode.left;

			} else {

				// Greater than focus node so go to the right
				isItALeftChild = false;

				// Shift the focus Node to the right child
				focusNode = focusNode.right;

			}

			// The node wasn't found
			if (focusNode == null)
				return false;

		}

		// If Node doesn't have children delete it
		if (focusNode.left == null && focusNode.right == null) {

			// If root delete it
			if (focusNode == root)
				root = null;

			// If it was marked as a left child
			// of the parent delete it in its parent
			else if (isItALeftChild)
				parent.left = null;

			// Vice versa for the right child

			else
				parent.right = null;

		}

		// If no right child

		else if (focusNode.right == null) {

			if (focusNode == root)
				root = focusNode.left;

			// If focus Node was on the left of parent
			// move the focus Nodes left child up to the
			// parent node
			else if (isItALeftChild)
				parent.left = focusNode.left;

			// Vice versa for the right child
			else
				parent.right = focusNode.left;

		}

		// If no left child
		else if (focusNode.left == null) {

			if (focusNode == root)
				root = focusNode.right;

			// If focus Node was on the left of parent
			// move the focus Nodes right child up to the
			// parent node
			else if (isItALeftChild)
				parent.left = focusNode.right;

			// Vice versa for the left child
			else
				parent.right = focusNode.right;

		}

		// Two children so I need to find the deleted nodes
		// replacement
		else {

			Node replacement = getReplacementNode(focusNode);
			// If the focusNode is root replace root
			// with the replacement
			if (focusNode == root)
				root = replacement;

			// If the deleted node was a left child
			// make the replacement the left child
			else if (isItALeftChild)
				parent.left = replacement;

			// Vice versa if it was a right child
			else
				parent.right = replacement;

			replacement.left = focusNode.left;

		}

		return true;

	}

	public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node focusNode = replacedNode.right;

		// While there are no more left children
		while (focusNode != null) {
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.left;

		}

		// If the replacement isn't the right child
		// move the replacement into the parents
		// leftChild slot and move the replaced nodes
		// right child into the replacements rightChild
		if (replacement != replacedNode.right) {
			replacementParent.left = replacement.right;
			replacement.right = replacedNode.right;

		}

		return replacement;

	}
	
	
	/* boolean isBST()  {
	        prev = null;
	        return isBST(root);
	    }
	 
	    // Returns true if given search tree is binary
	    //   search tree (efficient version) 
	    boolean isBST(Node node)
	    {
	    	prev = node;
	        // traverse the tree in inorder fashion and
	        // keep a track of previous node
	        if (node != null) {
	            if (!isBST(node.left)){
	                return false;
	            }
	 
	            if (prev != null && node.data <= prev.data ) {
	            	return false;
	            }
	                
	            
	            return isBST(node.right);
	        }
	        
	        return true;
	    }*/
	    
	public boolean isValidBST() {
	    return isValidBST(this.root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);    
	}
	 
	public boolean isValidBST(Node p, double min, double max){
	    if(p==null) 
	        return true;
	 
	    if(p.data <= min || p.data >= max)
	        return false;
	 
	    return isValidBST(p.left, min, p.data) && isValidBST(p.right, p.data, max);
	}
		
		
}


