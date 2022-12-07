import javax.lang.model.element.Element;

public class Testing {

	public static boolean patternRecognizer(String j) {
	    if (j == null) 
	        return false;
	    else if (j.length() == 1 || (j.length() == 2 && j.charAt(0) == j.charAt(1))) 
	        return true;
	    else if (j.length() == 2 && j.charAt(0) != j.charAt(1)) 
	        return false;
	    else if (j.charAt(0) == j.charAt(j.length() - 1))
	        return patternRecognizer(j.substring(1, j.length() - 1));
	    else return false;
	}
	
	public static void mergeSort(Element[] E, int first, int last) {
		if (first < last ) {             // base case == 1 element
		    int mid = ( first + last )/2; // calculate middle
			mergeSort( E, first , mid );
			mergeSort( E, mid+1 , last ); 
			// Which statement is true after these two recursive calls
			// merge( E, first , mid, last ); 
			   }
	}
}
