import java.io.PrintStream;
import java.util.NoSuchElementException;

public class StringDoubleEndedQueueImpl implements StringDoubleEndedQueue {
	Node head = null;
	Node tail = null;
	int size = 0;
	String data = null;
	
	//return true if the queue is empty
	public boolean isEmpty() {
		return this.head == null;
	}
	
	//insert a String item at the front of the queue
	public void addFirst(String item) {
		Node node = new Node(item);
		
		if(isEmpty()) {
			this.head = node;
			this.tail = node;
			head.setPrevious(null);
			tail.setNext(null);
		}
		else {
			head.setPrevious(node);
			node.setNext(head);
			this.head = node;
			head.setPrevious(null);
		}
		size++;
	}
	 //remove and return the item at the front of the queue
	 //@return String from the front of the queue
	 //@throws NoSuchElementException if the queue is empty
	public String removeFirst() throws NoSuchElementException{
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(head.getNext() == null) {
			data = head.getData();
			head = null;
		}
		else {
			data = head.getData();
			head = head.getNext();
			head.setPrevious(null);
		}
		size--;
		return data;
	}
	//insert a String item at the end of the queue
	public void addLast(String item) {
		Node node = new Node(item);
		
		if(isEmpty()) {
			this.head = node;
			this.tail = node;
			head.setPrevious(null);
			tail.setNext(null);
		}
		else {
			tail.setNext(node);
			node.setPrevious(tail);
			this.tail = node;
			tail.setNext(null);
		}
		size++;
	}
	 /*remove and return the item at the end of the queue
	   @return String from the end of the queue
	  @throws NoSuchElementException if the queue is empty */
	public String removeLast() throws NoSuchElementException{
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		if(head.getNext() == null) {
			data = head.getData();
			head = null;
		}
		else {
			data = tail.getData();
			tail = tail.getPrevious();
			tail.setNext(null);
		}
		size--;
		return data;
	}
	
	/*return without removing the item at the front of the queue
	 @return String from the front of the queue
	 @throws NoSuchElementException if the queue is empty */
	public String getFirst() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			return head.getData();
		}
	}
	/*return without removing the item at the end of the queue
	  @return String from the end of the queue
	  @throws NoSuchElementException if the queue is empty*/
	public String getLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			return tail.getData();
		}
	}
	/*print the String items of the queue, starting from the front, 
     	 to the print stream given as argument. For example, to 
         print the elements to the
	 standard output, pass System.out as parameter. E.g.,
	 printQueue(System.out);*/
	public void printQueue(PrintStream stream) {
		if(isEmpty()) {
			System.out.println("Error!!! The queue is empty.");
		}
		else {
			Node iterator = head;
			while (iterator.getNext() != null) {
			  	System.out.println(iterator.getData());
				iterator = iterator.getNext();
		    }
		//gia na tupwsei kai to tail
		System.out.println(iterator.getData());
		}
	}//printQueue
	
	/*return the size of the queue, 0 if empty
	  @return number of elements in the queue*/
	public int size() {
		return this.size;
	}
	
	/*puts the content (data) of the queue
	 * into a string and returns it
	 */
	public String ToString() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
		    Node iterator = this.head;
		    String str_queue = "";
		    while (iterator.getNext() != null) {  //diatrexoume thn oura 
			    str_queue = str_queue + iterator.getData();  //prosthetoume tous xarakthres ton komvon se ena string
			    iterator = iterator.getNext();
		    }
		    return str_queue = str_queue + this.tail.getData();  //prosthetoume sto string ton teleutaio xaraktira ths ouras
		}
	}//ToString
	
}//StringDoubleEndedQueueImpl 
