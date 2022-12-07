import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class FeedTest {

	Feed feed1=new Feed();
	User user1 = new User("Alisha");
	BackgroundImage backgroundImage1 = new BackgroundImage("image1", "title1", "description1");
	Meme meme1 = new Meme(backgroundImage1, "caption1", user1);
	ArrayList<Meme> memes=new ArrayList<Meme>();
	
	@Test
    public void setandgetMemes() {
		 
		 memes.add(meme1);
		 
		 feed1.setMemes(memes);
		 assertEquals(memes,feed1.getMemes());
	 
 }
	@Test
	public void getNewMemeTest() {
		
		 memes.add(meme1);
		 feed1.setMemes(memes);
		 assertEquals(meme1,feed1.getNewMeme(user1));
	}
	
	@Test
	public void toStringTest() {
		memes.add(meme1);
		feed1.setMemes(memes);
		String string1 = feed1.toString();
		
		
	}
}
