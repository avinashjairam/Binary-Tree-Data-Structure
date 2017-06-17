public class BinaryTree{
	 Node root;

	public BinaryTree(int key){
		this.root = new Node(key);
	}

	public BinaryTree(){
		this.root = null;
	}

	public void setRoot(int x){
		this.root = new Node(x);
	}

	public Node getRoot(){
		return this.root;
	}


}