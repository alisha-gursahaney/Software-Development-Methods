
public class Meme {
	
	private User creator;
	private BackgroundImage backgroundImage;
	private Rating[] ratings;
	private String caption;
	private String captionVerticalAlign;
	private boolean shared;
	
	public Meme() {
		this.creator = new User();
		this.backgroundImage = new BackgroundImage("", "", "");
		this.ratings = new Rating[10];
		this.caption = new String();
		this.captionVerticalAlign = new String("bottom");
		this.shared = true;
	}
		
	public Meme(BackgroundImage backgroundImage, String caption, User creator) {
		
		this.backgroundImage = backgroundImage;
		this.caption = caption;
		this.creator = creator;
		this.ratings = new Rating[10];
		this.captionVerticalAlign = new String("bottom");
		this.shared = true;
		
	}

	public User getCreator() {
		return this.creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public BackgroundImage getBackgroundImage() {
		return this.backgroundImage;
	}

	public void setBackgroundImage(BackgroundImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public Rating[] getRatings() {
		return this.ratings;
	}

	public void setRatings(Rating[] ratings) {
		this.ratings = ratings;
	}

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getCaptionVerticalAlign() {
		return captionVerticalAlign;
	}

	public boolean setCaptionVerticalAlign(String captionVerticalAlign) {
		
		if(captionVerticalAlign.equals("top") || captionVerticalAlign.equals("bottom") || captionVerticalAlign.equals("middle" )) {
			this.captionVerticalAlign = captionVerticalAlign;
			return true;
		}
		
		return false;
	}

	public boolean getShared() {
		return this.shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}
	
	private int calcRatingsSize() {
		
		int size = 0;
		for(int i = 0; i < 10; i++) {
			if(ratings[i] != null) {
				size++;
			}
		}
		
		return size;
	}
	
	
	public boolean addRating(Rating rat1) {
		
		if(calcRatingsSize() < 10) {
			for(int i = 0; i < 10; i++)
			{
				if(this.ratings[i] == null) {
					this.ratings[i] = rat1;
					return true;
				}
			}
			
		}
		else {
			for(int i = 1; i < 10; i++) {
				this.ratings[i-1] = ratings[i];
			}
			this.ratings[9] = rat1;
			return true;
		}
		return false;
	}
	
	public double calculateOverallRating() {
		double overallRating = 0.0;
			
			for (int i = 0; i < 10; i++) {
				if(this.ratings[i] != null) {
					overallRating += this.ratings[i].getScore();
				}
			}
			
			return overallRating;
				
	}
	
	private int calcNumRatings(int ratingType) {
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			if(ratings[i] != null) {
				
				if(ratings[i].getScore() == ratingType) {
					count++;
				}
			}
			
		}
		
		return count;
	}
	
	@Override
	public String toString() {
		
		
		return this.backgroundImage + " '" + this.caption + "' " + this.calculateOverallRating() + " [+1: " + calcNumRatings(1) + ", -1: " + calcNumRatings(-1) + "]";
	}
	
	@Override
	public boolean equals(Object m1) {
		if (m1 == null) {
			return false;
		}
		if(this == m1) {
			return true;
		}
		if (m1 instanceof Meme) {
			Meme otherMeme = (Meme) m1;
			if(this.getCreator().equals(otherMeme.creator) && this.getCaption().equals(otherMeme.caption) && this.getBackgroundImage().equals(otherMeme.backgroundImage)) {
				return true;
			}
					
		}
		
		return false;
	}

	
}
