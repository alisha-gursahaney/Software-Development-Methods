import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MemeTest {
	User user1 = new User("Alisha");
	User user2 = new User("Jamie");
	User user3 = new User("Chrissy");
	User user4 = new User();
	User user5 = new User();
	User user6 = new User();
	User user7 = new User();
	User user8 = new User();
	User user9 = new User();
	
	BackgroundImage image1 = new BackgroundImage("image1", "title1", "description1");
	BackgroundImage image2 = new BackgroundImage("image2", "title2", "description2");
	BackgroundImage image3 = new BackgroundImage("image3", "title3", "description3");
	BackgroundImage image4 = new BackgroundImage("image4", "title4", "description4");
	BackgroundImage image5 = new BackgroundImage("image5", "title5", "description5");
	BackgroundImage image6 = new BackgroundImage("image6", "title6", "description6");
	BackgroundImage image7 = new BackgroundImage("image7", "title7", "description7");
	BackgroundImage image8 = new BackgroundImage("image8", "title8", "description8");
	BackgroundImage image9 = new BackgroundImage("image9", "title9", "description9");
	
	Rating rating = new Rating(); 
	Rating rating1 = new Rating(user1, 1);
	Rating rating2 = new Rating(user2, 0);
	Rating rating3 = new Rating(user3, -1);
	Rating rating4 = new Rating(user1, 0);
	Rating rating5 = new Rating(user2, -1);
	Rating rating6 = new Rating(user3, 1);
	Rating rating7 = new Rating();
	Rating rating8 = new Rating();
	Rating rating9 = new Rating();
	
	Meme meme1 = new Meme(image1, "caption1", user1); 
	Meme meme2 = new Meme(image2, "caption2", user2); 
	Meme meme3 = new Meme(image3, "caption3", user3); 
	Meme meme4 = new Meme(image4, "caption4", user4); 
	Meme meme5 = new Meme(image5, "caption5", user5); 
	Meme meme6 = new Meme(image6, "caption6", user6); 
	Meme meme7 = new Meme(image7, "caption7", user7); 
	Meme meme8 = new Meme(image8, "caption8", user8); 
	Meme meme9 = new Meme(image9, "caption9", user9); 
	
	
	Rating[] rat1 = new Rating[10];
	Rating[] rat2 = new Rating[10];
	Rating[] rat3 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating9};
	Rating[] rat4 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, null, null};
	Rating[] rat5 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating3, rating4};
	
	@Test
	public void defaultConstructorTest() {
		assertNotNull(meme1.getCreator());
		assertNotNull(meme1.getBackgroundImage());
		assertNotNull(meme1.getRatings());
		assertNotNull(meme1.getCaption());
		assertNotNull(meme1.getCaptionVerticalAlign());
		assertEquals(true, meme1.getShared());
	}
	
	@Test
	public void overloadedConstructorTest() {
		assertEquals(image1, meme2.getBackgroundImage());
		assertEquals("caption", meme2.getCaption());
		assertEquals(user1, meme2.getCreator());
		assertEquals(true, meme2.getShared());
		assertNotNull(meme2.getRatings());
		assertNotNull(meme2.getCaptionVerticalAlign());
	}
	
	@Test
	public void setandGetCreator() {
		meme2.setCreator(user1);
		assertEquals(user1, meme2.getCreator());
	}
	
	@Test
	public void setandGetBackgroundImage() {
		meme2.setBackgroundImage(image1);
		assertEquals(image1, meme2.getBackgroundImage());
	}

	@Before
	public void setup() {
		image1= new BackgroundImage("1", "2", "3");
		image2 = new BackgroundImage("1", "3", "3");
		image3 = new BackgroundImage("1", "3", "4");
		
		user1 = new User("1");
		user2 = new User("2");
		
		rating1 = new Rating(user1, 1);
		rating2 = new Rating(user2, -1);
		
		meme1 = new Meme(image1, "1", user1);
		meme2 = new Meme(image1, "2", user2);
		meme3 = new Meme(image2, "3", user3);
		meme4 = new Meme(image2, "4", user4);
		meme5 = new Meme(image3, "5", user5);
		
	}

	@Test
	public void setandGetRatings() {
		meme1.setRatings(rat1);
		assertArrayEquals(rat1, meme1.getRatings());
	}

	@Test
	public void getandSetCaption() {
		meme1.setCaption("1");
		assertEquals("caption", meme1.getCaption());
	}
	
	@Test
	public void getandSetShared() {
		meme1.setShared(false);
		assertEquals(false, meme1.getShared());
	
	}

	@Test
	public void getandSetVerticalAllignCaption() {
		meme1.setCaptionVerticalAlign("top");
		assertEquals("top", meme1.getCaptionVerticalAlign());
		meme2.setCaptionVerticalAlign("bottom");
		assertEquals("bottom", meme2.getCaptionVerticalAlign());
		meme3.setCaptionVerticalAlign("middle");
		assertEquals("middle", meme3.getCaptionVerticalAlign());
		meme4.setCaptionVerticalAlign("side");
		assertEquals("bottom", meme4.getCaptionVerticalAlign());
		meme5.setCaptionVerticalAlign("top");
		meme6.setCaptionVerticalAlign("side");
	}

	@Test
	public void addRatingTest() {
		Meme meme = new Meme(new BackgroundImage("image", "title", "descriptionA"),"caption", user1);
		Rating rating=new Rating(user1,-1);
		assertEquals(true,meme.addRating(rating));
	}
	
	@Test
	public void calculateOverallRatingTest(){
		
		Meme meme = new Meme(new BackgroundImage("image", "title", "descriptionA"),"caption", new User()); 
		meme1.setRatings(rat3);
		
		double double1 = meme.calculateOverallRating();
		String string1 = Double.toString(double1);
		assertEquals("0.0",string1);  
		assertEquals(2.0, meme1.calculateOverallRating(), 0.001);
	}
	
	@Test
	public void compareToTest() {
		Meme meme1 = new Meme(new BackgroundImage("image", "title", "description1"),"caption", new User()); 
		
		assertEquals(0,meme1.compareTo(meme1));
		meme1.setRatings(rat3);
		meme3.setRatings(rat5);
		assertEquals(-1, meme2.compareTo(meme5));
		assertEquals(1, meme1.compareTo(meme3));
		
	}
	@Test
	public void toStringTest() {
		User user1=new User("Alisha");
		Meme meme1 = new Meme(new BackgroundImage("image", "title", "description1"),"caption", user1);
		
	}

	@Test
	public void countScoreTest() {
		User user1=new User("Alisha");
		Meme meme13 = new Meme(new BackgroundImage("image", "title", "description1"),"caption", user1);
	
	}
	
	@Test
	public void equalsTest()
	{
		Meme meme11 = new Meme(new BackgroundImage("image1", "title1", "description1"),"caption", new User()); 
		Meme meme12 = new Meme(new BackgroundImage("image2", "title2", "description2"),"caption", new User());
		
		assertEquals(false, meme2.equals(null));
		assertEquals(false, meme2.equals(image1));
		assertEquals(false, meme2.equals(meme6));
		assertEquals(false, meme2.equals(meme7));
		assertEquals(false, meme2.equals(meme8));
		assertEquals(true, meme2.equals(meme9));
		
		assertEquals(true,meme1.equals(meme1)); 
		assertEquals(false,meme1.equals(meme2)); 
		assertEquals(false, meme2.equals(null));
		assertEquals(false, meme2.equals(meme1));
		assertEquals(false, meme2.equals(meme6));
		assertEquals(false, meme2.equals(meme3));
		assertEquals(false, meme2.equals(meme1));
		assertEquals(true, meme2.equals(meme5));
		
	}
	
	@Test
	public void calcRatingSizeTest() {
		meme1.setRatings(rat1);
		meme2.setRatings(rat2);
		meme3.setRatings(rat3);
		assertEquals(true, meme2.addRating(rating1));
		assertEquals(true, meme1.addRating(rating2));
		meme1.setRatings(rat3);
		meme3.setRatings(rat5);
		assertEquals(-1, meme2.compareTo(meme5));
		assertEquals(1, meme1.compareTo(meme3));
	}
}

