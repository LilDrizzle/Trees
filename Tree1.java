
public class Tree1 {

	TreeNode start;
	
	
	public Tree1(TreeNode n) {
		start = n;
	}
	
	public TreeNode getRoot()
	{ return start; }
	
	
	// A Tree Traversal - by printing the tree
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
	
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~THE DELETE METHOD~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

	public void delete(TreeNode node, String word) {
		
		
		
		//base case
			// has 3 cases
		
		
		// THE SETUP
		//get it to node before
		if (node.getLeftPointer().getData().equals(word) ||
			node.getRightPointer().getData().equals(word)) 
		{
			//do nothing just skip the elses	
		}
		
		//check left
		else if(node.getData().compareTo(word) < 0) {
			TreeNode temp = node.getRightPointer();
			delete(temp, word);
		}
		
		//check right
		else if(node.getData().compareTo(word) > 0) {
			TreeNode temp = node.getLeftPointer();
			delete(temp, word);
		}
		
		
		
		//CASE 1 - no child
		
		//left node
		if (node.getLeftPointer().getData().equals(word)) {
			if (node.getLeftPointer().getLeftPointer() == null && node.getLeftPointer().getRightPointer() == null) {
				node.setLeftPointer(null);
			}
		}
			
		//right node
		if (node.getRightPointer().getData().equals(word)) {
			if (node.getRightPointer().getLeftPointer() == null && node.getLeftPointer().getRightPointer() == null) {
				node.setRightPointer(null);
			}
		}
			
		
		
		//CASE 2 - 1 child
		
		//left node
		if (node.getLeftPointer().getData().equals(word)) {
			if ( (node.getLeftPointer().getLeftPointer() != null || node.getLeftPointer().getRightPointer() != null) &&
				!(node.getLeftPointer().getLeftPointer() != null && node.getLeftPointer().getRightPointer() != null) )
			{
				if (node.getLeftPointer().getLeftPointer() != null) {
					TreeNode temp = node.getLeftPointer();
					node.setLeftPointer(temp.getLeftPointer());
					temp.setLeftPointer(null);
				}
				
				if (node.getLeftPointer().getRightPointer() != null) {
					TreeNode temp = node.getLeftPointer();
					node.setLeftPointer(temp.getRightPointer());
					temp.setRightPointer(null);
				}
			}
		} 
		
		//right node
		if (node.getRightPointer().getData().equals(word)) {
			if ( (node.getRightPointer().getLeftPointer() != null || node.getRightPointer().getRightPointer() != null) &&
				!(node.getRightPointer().getLeftPointer() != null && node.getRightPointer().getRightPointer() != null) )
			{
				if (node.getRightPointer().getLeftPointer() != null) {
					TreeNode temp = node.getRightPointer();
					node.setRightPointer(temp.getLeftPointer());
					temp.setLeftPointer(null);
				}
				
				if (node.getRightPointer().getRightPointer() != null) {
					TreeNode temp = node.getRightPointer();
					node.setRightPointer(temp.getRightPointer());
					temp.setRightPointer(null);
				}
			} 
		}
		
		
		//CASE 3 - 2 childs
		
	
	
	
	}

}




































