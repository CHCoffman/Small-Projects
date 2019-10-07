/* @author Colten Coffman
 * 9/7/2018 
 * Node class with integer key
 */
package binTree;
// Node with key 
public class Node 
{
	int key;

	Node left, right;

	public Node(int x) 
	{
		key = x;
		left = right = null;
	}
}
