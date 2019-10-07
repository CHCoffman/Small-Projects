/* @author Colten Coffman
 * 9/7/2018 
 * Implementation of a binary tree data structure with methods insertNode and treeWalk
 */
package binTree;
// insert and treeWalk methods
public class BinTree 
{
	Node root;
	
	// Constructor
	BinTree()
	{
		root = null;
	}
	
	// Node key
	private Node insertRec(Node root, Node n) 
	{
		if(root == null) 
		{
			root = n;
			return root;
		}
		if(n.key > root.key)
			root.left = insertRec(root.left,n);
		else if (n.key > root.key)
			root.right = insertRec(root.right,n);
		return root;
	}	
	// Inserts item into tree.
		// Post: item is in tree; search property is maintained 
	void insertNode(Node n) 
	{
		root = insertRec(root, n);
	}
	
	void treeWalkRec(Node root) 
	{
		if(root != null) 
		{
			treeWalkRec(root.left);
			System.out.println(root.key);
			treeWalkRec(root.right);
		}
	}

	// treeWalk method
	// post: node keys are printed in order
	void treeWalk() 
	{
		treeWalkRec(root);
	}
	
	// Tests insert and treewalk methods
	public static void main(String[] args) 
	{
		// testcase 2
		System.out.println();
		System.out.println("testcase 1:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(new Node(3));
		binTree2.insertNode(new Node(201));
		binTree2.insertNode(new Node(60));
		binTree2.insertNode(new Node(30));
		binTree2.insertNode(new Node(45));
		binTree2.treeWalk();
				
		// testcase 3
		System.out.println();
		System.out.println("testcase 2_1:");
		BinTree binTree3 = new BinTree();
		binTree3.insertNode(new Node(-10));
		binTree3.insertNode(new Node(-150));
		binTree3.insertNode(new Node(4));
		binTree3.insertNode(new Node(300));
		binTree3.insertNode(new Node(45));
		binTree3.treeWalk();
		binTree3.insertNode(new Node(-50));
		binTree3.insertNode(new Node(200));
		System.out.println();
		System.out.println("testcase 2_2:");
		binTree3.treeWalk();

	}
}
