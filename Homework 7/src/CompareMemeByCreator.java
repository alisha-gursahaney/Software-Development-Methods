import java.util.Comparator;

public class CompareMemeByCreator implements Comparator<Meme> {
	
	
	public int compare(Meme meme1, Meme meme2) {
		int ratingcompare = (int) (meme1.calculateOverallRating() - meme2.calculateOverallRating());
		int captioncompare = meme1.getCaption().compareTo(meme2.getCaption());
		int backgroundimagecompare = meme1.getBackgroundImage().compareTo(meme2.getBackgroundImage());
		int creatorcompare = meme1.getCreator().compareTo(meme2.getCreator());
		int sharedmemescompare = ((Boolean) meme1.getShared()).compareTo(meme2.getShared());
	
		if (creatorcompare == 0) {
			if (ratingcompare == 0) {
				if (captioncompare == 0) {
					if (backgroundimagecompare == 0) {
						return sharedmemescompare;
					}
					else {
						return backgroundimagecompare;
					}
				
					}
				else {
					return captioncompare;
				}
			}
			else {
				return ratingcompare * -1;
			}
		
			}
		return creatorcompare;
	}
}
