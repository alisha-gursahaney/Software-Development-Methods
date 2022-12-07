import java.util.ArrayList;
import java.util.TreeSet;

// received assistance from cohort (sam campbell, yuna lee, and rishab gopisetti) and TA during lab
// rishab also provided me with his hw3 code so that I could have working code for homework4 and be caught up with my cohort

public class User {

	private String userName;
	private ArrayList<Meme> memesCreated;
	private TreeSet<Meme> memesViewed;
	
	public User() {
		this.userName = new String();
		this.memesCreated = new ArrayList<Meme>();
		this.memesViewed = new TreeSet<Meme>();
	}
	
	public User(String userName) {
		this();
		this.userName = userName;
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
	public TreeSet<Meme> getMemesViewed() {
		return memesViewed;
	}

	public void setMemesViewed(TreeSet<Meme> memesViewed) {
		this.memesViewed = memesViewed;
	}
	
	public void rateMeme(Meme meme1, int rating1) {
		Rating addrating = new Rating(this, rating1);
		this.memesViewed.add(meme1);
		meme1.addRating(addrating);
	}
	
	public Meme createMeme(BackgroundImage backgroundImage, String caption) {
		Meme meme1 = new Meme(backgroundImage, caption, this);
			getMemesCreated().add(meme1);
		
		return meme1;
	}
	
	public boolean deleteMeme(Meme meme1) {
		boolean value = false;
		if (getMemesCreated().contains(meme1)) {
				int location = memesCreated.indexOf(meme1);
				if(!getMemesCreated().get(location).getShared()) {
					getMemesCreated().remove(location);
					value = true;
				}
			}
		return value;
	}
	
	public void shareMeme(Meme meme1, Feed feed1) {
		feed1.getMemes().add(meme1);
		meme1.setShared(true);
	}
	
	public boolean rateNextMemeFromFeed(Feed feed1, int ratingScore) {
		boolean value = false;
		if(feed1.getNewMeme(this) != null) {
			Rating rat1 = new Rating(this, ratingScore);
			feed1.getNewMeme(this).addRating(rat1);
			this.getMemesViewed().add(feed1.getNewMeme(this));
			value = true;
			
		}
		return value;
	}
	
	public double calculateReputation() {
		double total = 0.0;
		if (getMemesCreated().size() == 0) {
			return 0.0;
		}
	
		for(int i = 0; i < getMemesCreated().size(); i++) {
			total += getMemesCreated().get(i).calculateOverallRating();
			
		}
		double average = total / (getMemesCreated().size());
		
		return average;
		
	}
	
	@Override
	public String toString() {
		return this.userName + " has rated (" + getMemesViewed().size() + ") memes, (" 
	+ this.calculateReputation() + ")";	
	}
	
	@Override
	public boolean equals(Object object1) {
		boolean result = false;
		if ( this == object1 ) {
			result = true; 
			if (object1 instanceof User) {
				User other = (User) object1;
				if (userName.equals(other.userName)) {
					result = true;
					}
				}
			}
			
		return result;
		
		
	}
	
	public int compareTo(User other) {
		int userNamecompare = this.userName.compareTo(other.userName);
		int memescompare = memesCreated.size() - (other.memesCreated.size());
		if (userNamecompare == 0) {
			return memescompare * -1;
		}
		return userNamecompare;
	}
}
