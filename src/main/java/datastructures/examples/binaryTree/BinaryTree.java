package datastructures.examples.binaryTree;

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


