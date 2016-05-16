
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManySonsTree<String> tree = new ManySonsTree<String>();
		
		ManySonsTree<String>.NodeP<String> root = tree.addChild("Root", null);
		
		ManySonsTree<String>.NodeP<String> child1OfRoot = tree.addChild("Child_1 of root", root);
		ManySonsTree<String>.NodeP<String> child2OfRoot = tree.addChild("Child_2 of root", root);
		ManySonsTree<String>.NodeP<String> child3OfRoot = tree.addChild("Child_3 of root", root);
		
		ManySonsTree<String>.NodeP<String> child1OfChilld1 = tree.addChild("Child_1 of child_1", child1OfRoot);		
		ManySonsTree<String>.NodeP<String> child1OfChilld2 = tree.addChild("Child_1 of child_2", child2OfRoot);
		ManySonsTree<String>.NodeP<String> child1OfChilld3 = tree.addChild("Child_1 of child_3", child3OfRoot);
		ManySonsTree<String>.NodeP<String> child2OfChilld3 = tree.addChild("Child_2 of child_3", child3OfRoot);
		ManySonsTree<String>.NodeP<String> child3OfChilld3 = tree.addChild("Child_3 of child_3", child3OfRoot);

		
		tree.printInorder();
	}

}
