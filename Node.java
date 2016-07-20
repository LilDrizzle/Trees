//Tic-Tac-Toe Nodes

public class Node {

		private byte status;
		private Node[] pointerArray;
		
		public Node(byte status, TreeNode[] n) {
			this.status = status;
			pointerArray = n; 									//can i do this? does it just do the addresses?
		}
		
		public byte getStatus() 
		{ return status; }
		
		public TreeNode getNode(int position)
		{ return pointerArray[position]; }
		
		
		public void setStatus(byte status) 				//shouldn't need this
		{ this.status = status; }
		
		public void setNode(int position, Node n)
		{ pointerArray[position] = n; }
		
		public void setBranch(Node[] n)
		{ pointerArray = n; }									//can i do this? does it just do the addresses?
		
}