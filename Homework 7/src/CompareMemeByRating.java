import java.util.Comparator;

public class CompareMemeByRating implements Comparator<Meme> {
	
	public int compare(Meme meme1, Meme meme2) {
		double ratingcompare = meme1.calculateOverallRating() - meme2.calculateOverallRating();
		// type cast double ratingcompare from calculateOverallRating to int
		int ratingcompareint = (int) ratingcompare;
		int captioncompare = meme1.getCaption().compareTo(meme2.getCaption());
		int backgroundimagecompare = meme1.getBackgroundImage().compareTo(meme2.getBackgroundImage());
		int creatorcompare = meme1.getCreator().compareTo(meme2.getCreator());
		if (ratingcompareint == 0) {
			if (captioncompare == 0) {
				if (backgroundimagecompare == 0) {
					return creatorcompare;
					}

				else {
					return backgroundimagecompare;
					}
				}
			else {
				return captioncompare;
			}
		}
		return ratingcompareint * -1;
	}
}
