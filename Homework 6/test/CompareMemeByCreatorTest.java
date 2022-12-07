import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareMemeByCreatorTest {

	User user1 = new User("Alisha");
	User user2 = new User("Jamie");
	User user3 = new User("Chrissy");
	User user4 = new User();
	User user5 = new User();
	User user6 = new User();
	User user7 = new User();
	User user8 = new User();
	User user9 = new User();
	User user10 = new User();
	
	Rating rating = new Rating(); 
	Rating rating1 = new Rating(user1, 1);
	Rating rating2 = new Rating(user2, -1);
	Rating rating3 = new Rating(user3, 0);
	Rating rating4 = new Rating(user4, 1);
	Rating rating5 = new Rating(user5, 1);
	Rating rating6 = new Rating(user6, 1);
	Rating rating7 = new Rating(user7, 0);
	Rating rating8 = new Rating(user8, -1);
	Rating rating9 = new Rating(user9, -1);
	Rating rating10 = new Rating(user10, 1);
	
	BackgroundImage image1 = new BackgroundImage("image1", "title1", "description1");
	BackgroundImage image2 = new BackgroundImage("image2", "title2", "description2");
	BackgroundImage image3 = new BackgroundImage("image3", "title3", "description3");
	BackgroundImage image4 = new BackgroundImage("image4", "title4", "description4");
	BackgroundImage image5 = new BackgroundImage("image5", "title5", "description5");
	BackgroundImage image6 = new BackgroundImage("image6", "title6", "description6");
	BackgroundImage image7 = new BackgroundImage("image7", "title7", "description7");
	BackgroundImage image8 = new BackgroundImage("image8", "title8", "description8");
	BackgroundImage image9 = new BackgroundImage("image9", "title9", "description9");
	
	Meme meme1 = new Meme(image1, "caption1", user1); 
	Meme meme2 = new Meme(image2, "caption2", user2); 
	Meme meme3 = new Meme(image3, "caption3", user3);
	Meme meme4 = new Meme(image1, "caption4", user4); 
	Meme meme5 = new Meme(image2, "caption5", user5); 
	Meme meme6 = new Meme(image3, "caption6", user6); 
	Meme meme7 = new Meme(image1, "caption7", user7); 
	Meme meme8 = new Meme(image2, "caption8", user8); 
	Meme meme9 = new Meme(image3, "caption9", user9); 
	
	CompareMemeByCreator creator = new CompareMemeByCreator();
	Rating[] rat1 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating9};
	Rating[] rat2 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, null, null};
	Rating[] rat3 = {rating1, rating2, rating3, rating4, rating5, rating6, rating7, rating8, rating3, rating4};
	
	
	@Test
	public void compareTest() {
		meme3.setRatings(rat3);
		
		assertEquals(-1, creator.compare(meme2, meme5));
		assertEquals(-1, creator.compare(meme2, meme8));
		assertEquals(-1, creator.compare(meme2, meme7));
		assertEquals(0, creator.compare(meme2, meme9));
		assertEquals(-2, creator.compare(meme3, meme4));
		assertEquals(2, creator.compare(meme4, meme3));

		new Meme(new BackgroundImage("image", "title", "description"),"caption",user1);
	
	}

}
