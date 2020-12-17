
public class Node {
	
	    protected String data;
	    protected Node next = null;
	    protected Node previous = null;
	    
        //constructor
	    Node(String data) {
	        this.data = data;
	    }
	    //getters & setters
	    public String getData() {
	        // return data stored in this node
	        return data;
	    }
	    public void setData(String new_data) {
	    	this.data = new_data;
	    }
	    public Node getNext() {
	        // get next node
	        return next;
	    }
	    public Node getPrevious() {
	        // get previous node
	        return previous;
	    }
	    public void setNext(Node next) {
	        this.next = next;
	    }
	    public void setPrevious(Node previous) {
	        this.previous = previous;
	    }
}//class
