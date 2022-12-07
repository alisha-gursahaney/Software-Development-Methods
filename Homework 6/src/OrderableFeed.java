
// Sam Campbell helped me realize I was missing the keyword super
// updated from homework 5 because I had errors on the last submission

import java.util.ArrayList;
import java.util.Collections;

public class OrderableFeed extends Feed {
	
	public OrderableFeed() {super();
	}
	
	public OrderableFeed(ArrayList<Meme> meme) {
		super();
		super.setMemes(meme);
	}
		
	public void sortByCaption() {
		Collections.sort(getMemes());
	}
	
	public void sortByRating() {
		Collections.sort(getMemes(),
				new CompareMemeByRating());
	}
	
	public void sortByCreator() {
		Collections.sort(getMemes(),
				new CompareMemeByCreator());
	}
	

}