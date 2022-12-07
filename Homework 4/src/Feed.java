import java.util.ArrayList;

public class Feed {
	
	ArrayList<Meme> memes;
	
	public Feed() {
		this.memes = new ArrayList<Meme>();
	}

	public ArrayList<Meme> getMemes() {
		return this.memes;
	}

	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
	public Meme getNewMeme(User user1) {
		for( int i = 0; i < this.getMemes().size(); i++) {
			if(user1.getMemesCreated().contains(this.getMemes().get(i)) != true
					&& user1.getMemesViewed().contains(this.getMemes().get(i)) != true) {
				return this.getMemes().get(i);
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		String description = "";
		// for loop to return all the memes in the feed
		for(int i = 0; i < memes.size(); i++) {
			description = description + memes.get(i).toString() + "\n";
		}
		return description;
	}

}
