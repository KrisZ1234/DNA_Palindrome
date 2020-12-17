import java.util.Scanner;

public class DNAPalindrome{
	public static void main(String[] args) {

		    Scanner in = new Scanner(System.in);
			boolean DNAform = true;
			//    dhmiourgia ths ouras kai eisagwgh tou dna pou 8eloume na eleksoume
			StringDoubleEndedQueueImpl queue = new StringDoubleEndedQueueImpl();
			String dna = in.next();

			for (int i=0; i<dna.length(); i++) {
				/*
				 *   Diatrexoume to string dna kai gemizoume thn queue mas apo to tail pros to head me ta sumplhrwmatika A-T, C-G 
				 *   Me to break (sto else) elegxoume an mphkan swsta oi kataxwrhseis
				 */
				if ( dna.charAt(i) == 'A' ) { 
					queue.addFirst("T");
				}
				else if ( dna.charAt(i) == 'T' ) { 
					queue.addFirst("A");
				}
				else if ( dna.charAt(i) == 'C' ) { 
					queue.addFirst("G");
				}
				else if ( dna.charAt(i) == 'G' ) { 
					queue.addFirst("C");
				}
				else {
					System.out.println("Invalid entries -- NOT DNA form");
					DNAform = false;
					break;
				}				
			}//for	
			if (DNAform == true) {
				if (queue.ToString().contentEquals(dna)) {      //sygkrinoume to string pou mas dothike me to string pou proekupse
				    System.out.println( dna + ": Watson-Crick complemented palindrome");
				}
				else {
				    System.out.println( dna + ": NOT a Watson-Crick complemented palindrome");
				}
			}
			in.close();
	}//main
}//class