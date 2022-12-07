
import java.util.Collections;

// Sam Campbell helped me realize I was missing the keyword super

public class OrderableFeed extends Feed {
    
    public void sortByCaption() {
        Collections.sort(super.getMemes());
    }
    
    public void sortByRating() {
        Collections.sort(super.getMemes(), new CompareMemeByRating());
    }
    
    public void sortByCreator() {
        Collections.sort(super.getMemes(), new CompareMemeByCreator());
    }
}
