
public class Tree1 {

	TreeNode start;
	
	
	public Tree1(TreeNode n) {
		start = n;
	}
	
	public TreeNode getRoot()
	{ return start; }
	
	
	// A Tree Traversal
	public void printTree(TreeNode root) {
	
		
		// print left subtree
		if (root.getLeftPointer() != null) {
			TreeNode temp = root.getLeftPointer();
			printTree(temp);
		}
		
		// print root node
		System.out.println(root.getData());
		
		
		// print right subtree
		if (root.getRightPointer() != null) {
			TreeNode temp = root.getRightPointer();
			printTree(temp);
		}
	}
	
	
	public void insert(TreeNode root, TreeNode node) {
		
		//check left 
		if(node.getData().compareTo(root.getData()) < 0) {
			if (root.getLeftPointer() == null) 
				root.setLeftPointer(node);
			else
				insert(root.getLeftPointer(), node);
		}
		
		//check right
		if(node.getData().compareTo(root.getData()) > 0) {
			if (root.getRightPointer() == null) 
				root.setRightPointer(node);
			else
				insert(root.getRightPointer(), node);
		}
	}
	
	
	public void delete(TreeNode root, String word) {
		
		//base case
			// has 3 cases
		
		
		//get it to node before
		
		
		if(root.getData().compareTo(root.getData()) < 0) {
			if (root.getLeftPointer() == null) 
				root.setLeftPointer(node);
			else
				delete(root.getLeftPointer(), node);
		}
		
		//check right
		if(node.getData().compareTo(root.getData()) > 0) {
			if (root.getRightPointer() == null) 
				root.setRightPointer(node);
			else
				delete(root.getRightPointer(), node);
		}
		
		
		
		
		//case 1 - no child
			// left node
			if (node.getLeftPointer().getData().equals(word)) {
				if (node.getLeftPointer().getLeftPointer() == null && node.getLeftPointer().getRightPointer() == null) {
					node.setLeftPointer(null);
				}
			}
			
			// right node
			if (node.getRightPointer().getData().equals(word)) {
				if (node.getRightPointer().getLeftPointer() == null && node.getLeftPointer().getRightPointer() == null) {
					node.setRightPointer(null);
				}
			}
			
		//case 2 - 1 child
		
		//case 3 - 2 childs
	}
	
	
	
	
	
	
	
	
}