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

	public void Inorder(){
		Inorder(this.root);
		System.out.println();
	}

	public void Postorder(){
		Postorder(this.root);
	}

	public void Preorder(){
		Preorder(this.root);
	}

	public void Inorder(Node node){
		if(node == null){
			return;
		}

		Inorder(node.getLeft());

		System.out.print(node.getData());

		Inorder(node.getRight());
	}

	public void Preorder(Node node){
		if(node == null){
			return;
		}

		System.out.println(node.getData());

		Preorder(node.getLeft());

		Preorder(node.getRight());
	}

	public void Postorder(Node node){
		if(node == null){
			return;
		}

		Postorder(node.getLeft());

		Postorder(node.getRight());

		System.out.println(node.getData());
	}


}