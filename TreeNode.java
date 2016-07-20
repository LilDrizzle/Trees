public class TreeNode {

	private String name;
	private TreeNode leftPointer;
	private TreeNode rightPointer;
	
	public TreeNode(String n, TreeNode l, TreeNode r) {
		name = n;
		leftPointer = l;
		rightPointer = r;
	}
	
	public String getData()
	{ return name; }
	
	public TreeNode getLeftPointer()
	{ return leftPointer; }
	
	public TreeNode getRightPointer() 
	{ return rightPointer; }
	
	
	public void setLeftPointer(TreeNode l) 
	{ leftPointer = l; }
	
	public void setRightPointer(TreeNode r)
	{ rightPointer = r; }
	
}
