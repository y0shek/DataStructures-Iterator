import java.util.ArrayList;
import java.util.Iterator;
public class Iterator5{

	public static void main(String[] args){
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("A");
		aList.add("B");
		aList.add("C");
		
		ArrayList<String> bList = new ArrayList<String>();		
		bList.add("B");
		bList.add("D");
		bList.add("E");
		
		System.out.println(aList);
		System.out.println(bList);
		System.out.println(mixStrings(aList,bList));
		
	}
	
	
	// This static method is implemented in a main class.
	
	//public static ListADT<String> merge( ListADT<String> L1, ListADT<String> L2 ) throws BadListException {
	
		
	public static ListADT<String> mixStrings(ListADT<String> a, ListADT<String>b){

		ListADT<String> doneList = new ArrayList<String>(a);

		Iterator<String> iteratorB = b.iterator();
		Iterator<String> iteratorDone;
		int counter = 0;
		String tempDone = "";
		String tempB = "";
		
		while(iteratorB.hasNext()){
			tempB = iteratorB.next();
			iteratorDone = doneList.iterator();
			counter = 0;
			while(iteratorDone.hasNext()){
				tempDone = iteratorDone.next();
				if (tempB.compareTo(tempDone) <= 0){
					break;
				}
				counter++;
			}
			doneList.add(counter, tempB);
		}					
		return doneList;
	}
			
		
	// If L1 or L2 (or both L1 and L2) is null, throw a BadListException.
	// If L1 and L2 are both empty, return a new empty list.
	// If L1 is empty (but not L2), return a new list containing the objects in L2.
	// If L2 is empty (but not L1), return a new list containing the objects in L1.
	// Otherwise create and return a new list that contains the objects in L1 and
	//   in L2 in ascending order.  
	//
	//   Example:   L1: A,C,F      L2: B,E,T        result: A,B,C,E,F,T
	//   Example:   L1: A,B,C,D    L2: B,D,F,G      result: A,B,B,C,D,D,F,G
	//   Example:   L1: A,B,C,D    L2: B,C,D,E      result: A,B,B,C,C,D,D,E
	//
	// Preconditions: 
	// Any objects in L1 are already sorted in ascending order and 
	// Any objects in L2 are already sorted in ascending order

}
