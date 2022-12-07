import static org.junit.Assert.*;

import java.util.ArrayList;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	 User user1 = new User("Alisha");
	 User user2 = new User("Chrissy");
	 User user3 = new User("Jamie");
	 User user4 = new User ("Sophia");
	 
	 BackgroundImage image1 = new BackgroundImage("image1", "title1", "description1");

	 BackgroundImage image2 = new BackgroundImage("image2", "title2", "description2");

	 BackgroundImage image3 = new BackgroundImage("image3", "title3", "description3");

	 BackgroundImage image4 = new BackgroundImage("image4", "title4", "description4");
	 		
	 Meme meme1 = new Meme(image1, "caption1", user1); 
	 Meme meme2 = new Meme(image2, "caption2", user2); 
	 Meme meme3 = new Meme(image3, "caption3", user3); 
	 Meme meme4 = new Meme(image4, "caption4", user4); 
	 	
	 ArrayList<Meme> memes=new ArrayList<Meme>();
	 
	 @Before
		public void setup() {
		user1 = new User("user1");
		user2 = new User("user2");
		user3 = new User("user3");
		user4 = new User("user4");
			
		meme1 = new Meme(image1, "image1", user1);
		meme2 = new Meme(image2, "image2", user1);
		meme3 = new Meme();
	 }
	
	@Test
	public void setandgetUserName() {
		
		assertEquals("Alisha",user1.getUserName());
		
	}
	
	@Test
	public void setandgetMemesCreated() {
						 
			 memes.add(meme1);
			 memes.add(meme2);
			 memes.add(meme3);
			 memes.add(meme4);
			
			user1.setMemesCreated(memes);
			assertEquals(memes,user1.getMemesCreated());
		
	}
	
	@Test
	public void setandgetMemesViewed() {
		 
		 memes.add(meme1);
		 TreeSet<Meme> treeSetMeme=new TreeSet<Meme>(memes);
		 user1.setMemesViewed(treeSetMeme);
		 assertEquals(treeSetMeme,user1.getMemesViewed());
	}
	
	@Test
	public void rateMemeTest() {
		 
		 User user1 = new User("Alisha");
		 BackgroundImage backgroundImage1 = new BackgroundImage("image", "title1", "description1");
		 Meme meme1 = new Meme(backgroundImage1, "caption1", user1); 
		 
		 user1.rateMeme(meme1, 1);
		 memes.add(meme1);
		 TreeSet<Meme> treeSetMeme=new TreeSet<Meme>(memes);
		 assertEquals(treeSetMeme,user1.getMemesViewed());
		 
	}
	
	@Test
	public void createMemeTest() {
		
		User user5 = new User("Jamie");
		
		BackgroundImage backgroundImage5 = new BackgroundImage("image5", "title5", "description5");
		Meme meme5=new Meme(backgroundImage5, "caption5", user5);
		Meme testmeme=user5.createMeme(backgroundImage5, "caption5");
		
		CompareMemeByCreator comparememe=new CompareMemeByCreator();
		assertEquals(0,comparememe.compare(meme5, testmeme));		
		
	}
	@Test
	public void shareMemeTest()
	{
        User user5 = new User("Nora");
		
		BackgroundImage backgroundImage5 = new BackgroundImage("image5", "title5", "description5");
		Meme meme5=new Meme(backgroundImage5, "caption5", user5);
		Feed feed1=new Feed();
		user5.shareMeme(meme5, feed1);
		assertEquals(true,meme5.getShared());
		
	}
	
	@Test
	public void deleteMemeTest() {
		 memes.add(meme1);
		 memes.add(meme2);
		 memes.add(meme3);
		 memes.add(meme4);
		
		user1.setMemesCreated(memes);
		assertEquals(true,user1.deleteMeme(meme4));
	}
	
	@Test
	public void compareToTest() {
		 memes.add(meme1);
		 memes.add(meme2);
		 memes.add(meme3);
		 memes.add(meme4);
		
		user1.setMemesCreated(memes);
				
		assertEquals(0,user1.compareTo(user1));
	}
	
	@Test
	public void rateNextMemeFromFeedTest()
	{
		Feed feed1=new Feed();
		feed1.getMemes().add(meme1);
		assertEquals(true,user1.rateNextMemeFromFeed(feed1,1));
		Feed feed2=new Feed();
		feed2.getMemes().add(null);
		assertEquals(false,user1.rateNextMemeFromFeed(feed2,1));
	}
	
	@Test
	public void calculateReputationTest() {
		
		 memes.add(meme1);
		 memes.add(meme2);
		 memes.add(meme3);
		 memes.add(meme4);
		
		user1.setMemesCreated(memes);
		double reputation=user1.calculateReputation();
		String s=Double.toString(reputation);
		assertEquals("0.0",s);
		
	}
	
	@Test
	public void equalsTest() {
		assertEquals(false,user1.equals(user2));
	}
	
	@Test
	public void toStringTest() {
		 memes.add(meme1);
		 TreeSet<Meme> treeSetMeme=new TreeSet<Meme>(memes);
		 user1.setMemesViewed(treeSetMeme);
		 
		 assertEquals(user1 + " has rated (1) memes, (0.0)",user1.toString());
	}
}
	
