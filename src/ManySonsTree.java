
public class ManySonsTree<E extends Comparable<E>> {
	
	public Node<E> root = null;
	
	public Node<E> addChild(E data, Node<E> parent) {
		Node<E> node = new Node<E>(data);
		if (parent == null) {
			root = node;
			return node;
		} else {
			node.setParent(parent);
			if (parent.getChild() == null) {
				parent.setChild(node);
			} else {
				Node<E> curr = parent.getChild();
				Node<E> prev = parent.getChild();
				while (curr.getBrother() != null) {
					prev = curr;
					curr = curr.getBrother();
				}
				prev.setBrother(curr);
				curr.setBrother(node);
			}
			return node;
		}
	}
	
	public void printInorder() {
		printInOrderRec(root);
		System.out.println("");
	}

	private void printInOrderRec(Node<E> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + "; ");
		Node<E> curr = node.getChild();
		if (curr == null) {
			return;
		}
		while (curr != null) {
			printInOrderRec(curr);
			curr = curr.getBrother();
		}
	}

}
