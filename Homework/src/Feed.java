import java.util.ArrayList;

public class Feed {
	
	private ArrayList<Meme> memes;
	
	public Feed() {
		this.memes = new ArrayList<Meme>();
	}
		
	@Override
	public String toString() {
		return "";
	}
	
	// generated getters and setters
	public ArrayList<Meme> getMemes() {
		return memes;
	}

	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
	public Meme getNewMeme(User user) {
		return null;
	}
	
	
}	
