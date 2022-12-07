import java.util.ArrayList;

public class Feed {
	
	private ArrayList<Meme> memes;
	
	public Feed() {
		this.memes = new ArrayList<Meme>();
	}

	public ArrayList<Meme> getMemes() {
		return this.memes;
	}

	public void setMemes(ArrayList<Meme> memes) {
		this.memes = memes;
	}
	
	public Meme getNewMeme(User u1) {
		return null;
	}
	
	@Override
	public String toString() {
		return "";
	}

}
