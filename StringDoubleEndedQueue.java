
import java.io.PrintStream;
import java.util.NoSuchElementException;
//Defines the methods for a Double-ended Queue that handles String itemspublic interface StringDoubleEndedQueue {	public boolean isEmpty();	public void addFirst(String item);	public String removeFirst() throws NoSuchElementException;	public void addLast(String item);	public String removeLast() throws NoSuchElementException;		public String getFirst();	public String getLast();	public void printQueue(PrintStream stream);	public int size();}