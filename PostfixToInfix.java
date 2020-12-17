import java.util.Scanner;

public class PostfixToInfix {
	
	public static void main(String[] args) {
		
        try (Scanner in = new Scanner(System.in)) {
			//dhmiourgia ths ouras kai eisagwgh ths postfix ekfrashs mas
			StringDoubleEndedQueueImpl queue = new StringDoubleEndedQueueImpl();
			String postfix = in.next();
			        
			for(int i=0; i<postfix.length(); i++) {
				/*
				 * diatrexoume thn postfix ekfrash kai ka8e ths xarakthra 
				 * ton apotupwnoume sthn metavlhth character se morfh string
				 */
				String character = Character.toString(postfix.charAt(i));

				if (( Character.isDigit(postfix.charAt(i)) || Character.isAlphabetic(postfix.charAt(i)) )){
					/*
					 * oso oi xarakthres tis postfix einai aploi ari8moi 
					 * h metavlhtes (tupou x,y,a,b ktl)
					 * ta topo8etoume sto telos ths ouras
					 */
					queue.addLast(character);
				}
				else {
					/*
					 * otan o epomenos xarakthras ths postfix de einai ari8mos h gramma,
					 * ara einai +-/*, tote pernoume ta 
					 * duo teleutaia stoixeia ths ouras ta enwnoume me to +-/*
					 * kai ta epistrefoume sto telos ths ouras san eniaio stoixeio
					 */
					String newString = "(" + queue.tail.getPrevious().getData() 
					                       + character
			                                       + queue.removeLast() + ")";
					
			                queue.removeLast();
			                queue.addLast(newString);
				}
			}//for
			queue.printQueue(System.out);
		}//try
	}//main
}//class
