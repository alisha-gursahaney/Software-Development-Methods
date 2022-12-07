import static org.junit.Assert.*;

import org.junit.Test;

public class BackgroundImageTest {

	 BackgroundImage image1 = new BackgroundImage("image1", "title1", "description1");
	 BackgroundImage image2 = new BackgroundImage("image2", "title2", "description2");
	 BackgroundImage image3 = new BackgroundImage("image3", "title3", "description3");
	 BackgroundImage image4 = new BackgroundImage("image4", "title4", "description4");
	 BackgroundImage image5 = new BackgroundImage("image5", "title5", "description5");
	 BackgroundImage image6 = new BackgroundImage("image6", "title6", "description6");
	 BackgroundImage image7 = new BackgroundImage("image7", "title7", "description7");
	 BackgroundImage image8 = new BackgroundImage("image8", "title8", "description8");
	 BackgroundImage image9 = new BackgroundImage("image9", "title9", "description9");
	
	 @Test
		public void defaultConstructorTest() {
			assertNotNull(image1.getImageFileName());
			assertNotNull(image1.getTitle());
			assertNotNull(image1.getDescription());
			assertNotNull(image2.getImageFileName());
			assertNotNull(image2.getTitle());
			assertNotNull(image2.getDescription());
		}
	 
	 @Test
		public void overloadedConstructorTest() {
			assertEquals("image", image1.getImageFileName());
			assertEquals("title", image1.getTitle());
			assertEquals("description", image1.getDescription());
			assertEquals("image", image2.getImageFileName());
			assertEquals("title", image2.getTitle());
			assertEquals("description", image2.getDescription());
		}
	 
	@Test
	public void setandgetImageFileNameTest() {
		BackgroundImage meme1 = new BackgroundImage();
		meme1.setImageFileName("meme1");
		assertEquals("meme1",meme1.getImageFileName());
		image2.setImageFileName("image2");
		assertEquals("image2",image2.getImageFileName());
	}
	@Test
	public void setandgetTitleTest() {
		BackgroundImage meme1 = new BackgroundImage();
		meme1.setTitle("title1");
		assertEquals("title1", meme1.getTitle());
		image2.setTitle("image2");
		assertEquals("image2", image2.getTitle());

	}
	@Test
	public void setandGetDescriptionTest() {
		BackgroundImage meme1 = new BackgroundImage(); 
		meme1.setDescription("description1");
		assertEquals("description1", meme1.getDescription());
		image2.setDescription("image2");
		assertEquals("image2", image2.getDescription());
	}
	
	
	@Test
	public void toStringTest() {
		BackgroundImage image2 = new BackgroundImage("meme3", "description", "title"); 
		assertEquals("title <description>", image2.toString());
		
}
	@Test 
	public void equalsTest() {
		Feed feed1 = new Feed();
		BackgroundImage meme1 = new BackgroundImage("meme1", "description1", "title1"); 
		BackgroundImage meme2 = new BackgroundImage("meme2", "description2", "title2"); 
		BackgroundImage meme3 = new BackgroundImage(); 
		BackgroundImage meme4 = new BackgroundImage(); 

		assertEquals(true, meme2.equals(meme3));
		assertEquals(false, meme2.equals(meme4));
		assertEquals(false, meme2.equals(feed1));
		assertEquals(false, meme2.equals(null));
		assertEquals(false, meme4.equals(meme2));
		assertEquals(false, meme4.equals(meme3));
		assertEquals(false, meme1.equals(meme4));
		assertEquals(false, meme2.equals(meme1));
		assertEquals(false, meme3.equals(meme1));
		assertEquals(false, meme1.equals(meme1));
	
	} 
	@ Test
	public void compareToTest() {
		BackgroundImage meme1 = new BackgroundImage("meme1", "description1", "title1"); 
		BackgroundImage meme4 = new BackgroundImage("meme2", "description2", "title2"); 
		BackgroundImage meme5 = new BackgroundImage("meme3", "description3", "title3"); 
		
		assertEquals(0, meme4.compareTo(meme4));
		assertEquals(0, meme4.compareTo(meme5));
		assertEquals(0, meme5.compareTo(meme4));
		assertEquals(0, meme1.compareTo(meme4));
		assertEquals(0, meme4.compareTo(meme1));
		assertEquals(0, meme1.compareTo(meme1));
		
		assertEquals(0, image2.compareTo(image3));
		assertEquals(-1, image4.compareTo(image7));
		assertEquals(-1, image4.compareTo(image9));
		assertEquals(-1, image4.compareTo(image5));
	}
	
	
}
	