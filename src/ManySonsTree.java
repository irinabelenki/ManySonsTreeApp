
public class ManySonsTree<E extends Comparable<E>> {
	
	class NodeP<T> {
	    private T data;
	    private NodeP<T> parent = null;
	    private NodeP<T> child = null;
	    private NodeP<T> brother = null;
	    
	    public NodeP(T data) {
	    	this.data = data;
	    }
	    
	    public NodeP(T data, NodeP<T> parent) {
	    	this.data = data;
	    	this.parent = parent;
	    }
	    
	    public T getData() {
	        return data;
	    }
	    
	    public NodeP<T> getParent() {
	        return parent;
	    }
	    
	    private void setChild(NodeP<T> child) {
	        this.child = child;
	    }
	    
	    public NodeP<T> getChild() {
	        return child;
	    }
	    
	    private void setBrother(NodeP<T> brother) {
	        this.brother = brother;
	    }
	    
	    public NodeP<T> getBrother() {
	        return brother;
	    }

	}
	
	
	public NodeP<E> root = null;
	
	public NodeP<E> addChild(E data, NodeP<E> parent) {
		NodeP<E> node = new NodeP<E>(data, parent);
		if (parent == null) {
			root = node;
			return node;
		} else {
			//node.setParent(parent);
			if (parent.getChild() == null) {
				parent.setChild(node);
			} else {
				NodeP<E> curr = parent.getChild();
				NodeP<E> prev = parent.getChild();
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

	private void printInOrderRec(NodeP<E> node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + "; ");
		NodeP<E> curr = node.getChild();
		while (curr != null) {
			printInOrderRec(curr);
			curr = curr.getBrother();
		}
	}
}
