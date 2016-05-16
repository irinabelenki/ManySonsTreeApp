
class Node<T> {
	    private T data;
	    private Node<T> parent = null;
	    private Node<T> child = null;
	    private Node<T> brother = null;
	    
	    public Node(T data) {
	    	this.data = data;
	    }
	    
	    public Node(T data, Node<T> parent) {
	    	this.data = data;
	    	this.parent = parent;
	    }
	    
	    public T getData() {
	        return data;
	    }
	    
	    public Node<T> getParent() {
	        return parent;
	    }
	    
	    private void setChild(Node<T> child) {
	        this.child = child;
	    }
	    
	    public Node<T> getChild() {
	        return child;
	    }
	    
	    private void setBrother(Node<T> brother) {
	        this.brother = brother;
	    }
	    
	    public Node<T> getBrother() {
	        return brother;
	    }

}