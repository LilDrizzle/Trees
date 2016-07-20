
public class TreeDriver {
	public static void main(String[] args) {
	
		TreeNode n1 = new TreeNode("n1", null, null);
		Tree1 myTree = new Tree1(n1);
		
		TreeNode n2 = new TreeNode("n2", null, null);
		TreeNode n3 = new TreeNode("n3", null, null);
		TreeNode n4 = new TreeNode("n4", null, null);
		TreeNode n5 = new TreeNode("n5", null, null);
		TreeNode n6 = new TreeNode("n6", null, null);
		TreeNode n7 = new TreeNode("n7", null, null);
		TreeNode n8 = new TreeNode("n8", null, null);
	
		n1.setLeftPointer(n2);
		n1.setRightPointer(n3);
		n2.setLeftPointer(n4);
		n2.setRightPointer(n5);
		n3.setLeftPointer(n6);
		n3.setRightPointer(n7);
		
		
		
		
		//n1.setLeftPointer(new TreeNode("duck", null, null));
		//n1.setRightPointer(new TreeNode("spaghetti", null, null));
		
		//System.out.println(myTree.getRoot());
		//System.out.println(myTree.getRoot().getData());
		//System.out.println(myTree.getRoot().getLeftPointer().getData());
		//System.out.println(myTree.getRoot().getRightPointer().getData());
		//System.out.println(myTree.getRoot().getRightPointer().getLeftPointer().getData());

		myTree.insert(n1, n8);
		myTree.printTree(n1);
		
		System.out.println();
		
		myTree.delete(n1, "n8");
		myTree.printTree(n1);
		
		//myTree.delete(n1, n4);		
	}	
}