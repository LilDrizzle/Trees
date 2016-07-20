// The big tree

public class TheTree {
	
	Node theMainPointer;
	
	public TheTree(TreeNode n) {
		theMainPointer = n;
	}
	
	public TreeNode getRoot() {
		return theMainPointer;
	}	
	
	
	public void buildTheTree(int turn) { //weird that im not doing this in main?
		
		if (turn == 1) {
				Node initialNode = new Node(null, null);
				TheTree myTree = new TheTree(initialNode);			//weird part
				Node[] layerNine = new Node[null, 9];
				Node[] layerEight = new Node[null, 8];
				Node[] layerSeven = new Node[null, 7];
				Node[] layerSix = new Node[null, 6];
				Node[] layerFive = new Node[null, 5];
				Node[] layerFour = new Node[null, 4];
				Node[] layerThree = new Node[null, 3];
				Node[] layerTwo = new Node[null, 2];
				
				//layerOne = new Node[null, 1]; //layer one needs values,		 362,880 values
				
				//create base layer
				for
				 
				
		}
		
		
		if (turn == 2) {
			
		}
		
		
	}
}

/*
362880
40320
5040
720
120
total: 409080
*/