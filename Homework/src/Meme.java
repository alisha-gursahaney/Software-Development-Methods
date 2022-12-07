public class Meme {
	
	private User creator;
	private BackgroundImage backgroundImage;
	private Rating[] ratings;
	private String caption;
	private String captionVerticalAlign;
	private boolean shared;
	
	public boolean addRating(Rating rating1) {
		return true;
	}
	
	public double calculateOverallRating() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override
	public boolean equals(Object meme1) {
		return true;
	}
	
	
	public Meme() {
		this.creator = new User();
		this.backgroundImage = new BackgroundImage();
		this.ratings = new Rating[1];
		this.caption = "";
		this.captionVerticalAlign = "";
		this.shared = true;
		}
	
	// generated getters and setters
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
	
}

