
class Node<T> {
	    private T data = null;
	    private Node<T> parent = null;
	    private Node<T> child = null;
	    private Node<T> brother = null;
	    
	    public Node(T data) {
	    	this.data = data;
	    }
	    
	    public T getData() {
	        return data;
	    }
	    
	    public void setParent(Node<T> parent) {
	        this.parent = parent;
	    }
	    
	    public Node<T> getParent() {
	        return parent;
	    }
	    
	    public void setChild(Node<T> child) {
	        this.child = child;
	    }
	    
	    public Node<T> getChild() {
	        return child;
	    }
	    
	    public void setBrother(Node<T> brother) {
	        this.brother = brother;
	    }
	    
	    public Node<T> getBrother() {
	        return brother;
	    }

/*
	    public Node(T data, Node<T> parent) {
	        this.data = data;
	        this.parent = parent;
	    }

	    public List<Node<T>> getChildren() {
	        return children;
	    }

	    public void setParent(Node<T> parent) {
	        parent.addChild(this);
	        this.parent = parent;
	    }

	    public void addChild(T data) {
	        Node<T> child = new Node<T>(data);
	        child.setParent(this);
	        this.children.add(child);
	    }

	    public void addChild(Node<T> child) {
	        child.setParent(this);
	        this.children.add(child);
	    }

	    public T getData() {
	        return this.data;
	    }

	    public void setData(T data) {
	        this.data = data;
	    }

	    public boolean isRoot() {
	        return (this.parent == null);
	    }

	    public boolean isLeaf() {
	    	return this.children.size() == 0;
	    }
*/
}