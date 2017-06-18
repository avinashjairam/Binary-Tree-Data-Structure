public class Test{
	public static void main(String [] args){
		BinaryTree tree = new BinaryTree();

		tree.setRoot(1);

		tree.getRoot().setLeft(new Node(2));// Node(2);//.setData(2);
		tree.getRoot().setRight(new Node(3));

		tree.getRoot().getLeft().setLeft(new Node(4));

		//System.out.println(tree.getRoot().getData() + " " +  tree.getRoot().getLeft().getData() + " " + tree.getRoot().getRight().getData());
	}
}