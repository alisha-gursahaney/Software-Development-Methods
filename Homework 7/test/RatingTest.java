import static org.junit.Assert.*;

import org.junit.Test;

public class RatingTest {

	User user1 = new User("Alisha");
	User user2 = new User("Jamie");
	User user3 = new User("Chrissy");
	User user4 = new User();
	User user5 = new User();
	User user6 = new User();
	User user7 = new User();
	User user8 = new User();
	User user9 = new User();
	
	Rating rating = new Rating(); 
	Rating rating1 = new Rating();
	Rating rating2 = new Rating(user1, 1);
	Rating rating3 = new Rating();
	Rating rating4 = new Rating();
	Rating rating5 = new Rating(user2, 0);
	Rating rating6 = new Rating(user3, -1);
	Rating rating7 = new Rating(user1, 1);
	Rating rating8 = new Rating(user1, 0);
	Rating rating9 = new Rating(user2, 1);
	
	@Test
	public void defaultConstructorTest() {
		assertEquals(0, rating1.getScore());
		assertNotNull(rating1.getUser());
	}

	@Test
	public void overloadedConstructorTest() {
		assertEquals(1, rating2.getScore());
		assertEquals(user1, rating2.getUser());
	}
	
	@Test
	public void setandgetUserTest() {
		User user1 = new User("Alisha"); 
		rating.setUser(user1); 
		assertEquals(user1, rating.getUser());
		rating2.setUser(user2);
		assertEquals(user2, rating2.getUser());
		}
	
	@Test
	public void setandgetScoreTest() {
		rating.setScore(-1);
		assertEquals(-1,rating.getScore());
		rating1.setScore(-1);
		assertEquals(-1, rating1.getScore());
		rating2.setScore(2);
		assertEquals(1, rating2.getScore());
		rating3.setScore(0);
		assertEquals(0, rating3.getScore());
		rating4.setScore(1);
		assertEquals(1, rating4.getScore());
	} 

	@Test
	public void toStringTest() { 
		Rating ratetest = new Rating(new User(), -1); 
		assertEquals("username rated as a downvote", ratetest.toString()); 
		assertEquals("username rated as an upvote", rating2.toString());
		assertEquals("username rated as a downvote", rating6.toString());
		assertEquals("username rated as a pass", rating5.toString());
	}
	
	@Test 
	public void equalsTest() {
	assertEquals(false,rating.equals(null));
	assertEquals(true,rating.equals(rating));
	Feed feed1 = new Feed();
	assertEquals(true, rating4.equals(rating));
	assertEquals(false, rating3.equals(null));
	assertEquals(false, rating1.equals(rating8));
	assertEquals(false, rating2.equals(rating9));
	assertEquals(false, rating6.equals(rating5));
	assertEquals(false, rating9.equals(feed1));
	assertEquals(true, rating2.equals(rating2));
	}
}
