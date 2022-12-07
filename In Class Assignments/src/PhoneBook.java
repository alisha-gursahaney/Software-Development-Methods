import java.util.Map;
import java.util.TreeMap;

// received help from cohort specifically sam campbell. we did our own, but he helped fix some of my errors and the order of my code.

public class PhoneBook {
	public static TreeMap<Integer, String> reverseBook(TreeMap<String, Integer> phoneBook) {
		
		// method to reverse the books (names don't matter here)
	    // TreeMap<String, Integer> book = new TreeMap<>();
		TreeMap<Integer, String> reverse = new TreeMap<>();
	    
	    for (Map.Entry<String,Integer> entry : phoneBook.entrySet()) {
	    	reverse.put(entry.getValue(), entry.getKey());
	    }
	    	return reverse;
			
		}

	    	
	
	
		public static void main(String[] args) {
		
		TreeMap<String, Integer> phoneBook = new TreeMap<>();
		TreeMap<Integer, String> reverseBook = new TreeMap<>();
		//testing
			phoneBook.put("Alisha", 4448);
			phoneBook.put("Mom", 3324);
			phoneBook.put("Sarina", 5611);
			
			// duplicates
			phoneBook.put("Mom", 1234);
			phoneBook.put("Elmo", 4448);
			
			
			System.out.println(phoneBook);
			System.out.println(reverseBook);
	
		TreeMap<Integer, String> newreverse = reverseBook(phoneBook);
		System.out.println(newreverse);
		
		// testing
		System.out.println(newreverse.get(4448));
		System.out.println(phoneBook.get("Mom"));
		}
	}
		
	// having a phone book with multiple names or numbers would produce the most recent addition to the map when using .get() to get the value. it would essentially override the original key. 
// we could have duplicate values, but not duplicate keys. keys are overridden