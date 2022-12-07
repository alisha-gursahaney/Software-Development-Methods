import java.util.ArrayList;

public class User {

	private String userName;
	private ArrayList<Meme> memesCreated;
	private ArrayList<Meme> memesViewed;
	
	public User() {
		this.userName = new String();
		this.memesCreated = new ArrayList<Meme>();
		this.memesViewed = new ArrayList<Meme>();
	}
	
	public User(String userName) {
		this.userName = new String();
		this.memesCreated = new ArrayList<Meme>();
		this.memesViewed = new ArrayList<Meme>();
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ArrayList<Meme> getMemesCreated() {
		return this.memesCreated;
	}

	public void setMemesCreated(ArrayList<Meme> memesCreated) {
		this.memesCreated = memesCreated;
	}

	public ArrayList<Meme> getMemesViewed() {
		return this.memesViewed;
	}

	public void setMemesViewed(ArrayList<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}
	
	public void rateMeme(Meme m1, int rating) {
		
	}
	
	public Meme createMeme(BackgroundImage backgroundImage, String caption) {
		return new Meme();
	}
	
	public boolean deleteMeme(Meme m1) {
		return true;
	}
	
	public void shareMeme(Meme m1, Feed f1) {
	}
	
	public void rateNextMemeFromFeed(Feed f1, int ratingScore) {
	}
	
	public double calculateReputation() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "";
	}
	
	@Override
	public boolean equals(Object u1) {
		return super.equals(u1);
	}
	
}
