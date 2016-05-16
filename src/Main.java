
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManySonsTree<String> tree = new ManySonsTree<String>();
		
		Node<String> root = tree.addChild("Root", null);
		
		Node<String> child1OfRoot = tree.addChild("Child_1 of root", root);
		Node<String> child2OfRoot = tree.addChild("Child_2 of root", root);
		Node<String> child3OfRoot = tree.addChild("Child_3 of root", root);
		
		Node<String> child1OfChilld1 = tree.addChild("Child_1 of child_1", child1OfRoot);		
		Node<String> child1OfChilld2 = tree.addChild("Child_1 of child_2", child2OfRoot);
		Node<String> child1OfChilld3 = tree.addChild("Child_1 of child_3", child3OfRoot);
		Node<String> child2OfChilld3 = tree.addChild("Child_2 of child_3", child3OfRoot);
		Node<String> child3OfChilld3 = tree.addChild("Child_3 of child_3", child3OfRoot);

		
		tree.printInorder();
	}

}
