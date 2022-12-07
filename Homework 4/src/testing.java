import java.util.ArrayList;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackgroundImage image1 = new BackgroundImage("Avengers meme", "Avengers Endgame quotes", "I love you 3000");
		System.out.println(image1);
		
		BackgroundImage image2 = new BackgroundImage("Spiderman meme", "Spiderman pointing to other spidermans", "Tobey Mcguire, Andrew Garfield, and Tom Holland after Sony messed up");
		System.out.println(image2);
		
		BackgroundImage image3 = new BackgroundImage();
        BackgroundImage image4 = new BackgroundImage();
        
        System.out.println("\n");
        
		
		String caption = "marvel";
		Meme meme = new Meme();
		System.out.println(meme.setCaptionVerticalAlign("dc"));
		
		Rating ratingpos1 = new Rating(null, 1);
		Rating rating0 = new Rating(null, 0);
		Rating ratingneg1 = new Rating(null, -1);
		
		
		User user1 = new User("alishameena");
		User user2 = new User("chrissyebaker");
		User user3 = new User("jamiegjeong");
		User user4 = new User("sophiacheng");
		
		String caption1 = "hello alisha";
		String caption2 = "hello chrissy";
		String caption3 = "hello jamie";
		String caption4 = "hello sophia";
		
		Feed feed1 = new Feed();
        Feed feed2 = new Feed();
 
        
        Meme meme1 = new Meme(image1, caption1, user1);
        Meme meme2 = new Meme(image2, caption2, user2);
        Meme meme3 = new Meme(image3, caption3, user3);
        Meme meme0 = new Meme(image4, caption4, user4);
        Rating rating1 = new Rating(user1, 0);
        Rating rating2 = new Rating(user2, 1);
        meme0.addRating(ratingpos1);
		meme0.addRating(rating0);
		meme0.addRating(ratingneg1);
		meme0.addRating(rating0);
		meme0.addRating(ratingpos1);
		meme0.addRating(ratingneg1);
		meme0.addRating(rating0);
		meme0.addRating(rating0);
		meme0.addRating(ratingpos1);
		meme0.addRating(ratingneg1);
        
        ArrayList<Meme> memesFeed = new ArrayList<Meme>();
        memesFeed.add(meme0);
        memesFeed.add(meme1);
        memesFeed.add(meme2);
        memesFeed.add(meme3);
       
        ArrayList<Meme> memesViewed = new ArrayList<Meme>();
        memesViewed.add(meme0);
        memesViewed.add(meme3);
        
        ArrayList<Meme> memesCreated = new ArrayList<Meme>();
        memesCreated.add(meme0);
        memesCreated.add(meme1);
 
        
        feed2.setMemes(memesFeed);
        user2.setMemesViewed(memesViewed);
        user2.setMemesCreated(memesCreated);
        
        System.out.println(user1.toString());   
        System.out.println(user2.toString());   
        System.out.println(feed1.toString());
        System.out.println(feed2.toString());
        System.out.println(meme0.toString()); 
        System.out.println(rating1.toString()); 
        System.out.println(rating2.toString()); 
        
        System.out.println("\n");
        
        // equals method: false then true
        System.out.println(user1.equals(user2));  
        System.out.println(user1.equals(user1));   
        
        System.out.println("\n");
        
        // return void/null
        System.out.println(feed1.getNewMeme(user1)); 
        System.out.println(feed2.getNewMeme(user2));
        
        System.out.println("\n");
        
        System.out.println(user1.calculateReputation());
        System.out.println(user2.calculateReputation());
        
        System.out.println("\n");
        
        System.out.println(feed1.getMemes()); 
        user1.shareMeme(meme1, feed1);
        user1.shareMeme(meme0, feed1);
        System.out.println(feed1.getMemes()); 
        
        System.out.println("\n");
        
        System.out.println(user2.getMemesCreated()); 
        System.out.println(user2.deleteMeme(meme1));
        System.out.println(user2.deleteMeme(meme2));
        System.out.println(user2.getMemesCreated());
        
        System.out.println("\n");
        
        System.out.println(user1.createMeme(image1, caption));
        System.out.println(user2.createMeme(image2, caption1));
        
        user1.rateMeme(meme1, rating1.getScore());
        user2.rateMeme(meme2, rating2.getScore());
        
        System.out.println("\n");
        
        System.out.println(user1.rateNextMemeFromFeed(feed1, 0));   
        System.out.println(user2.rateNextMemeFromFeed(feed2, rating2.getScore()));  
        
        
        System.out.println("\n");
        
        System.out.println(user1.calculateReputation());
        System.out.println(user2.calculateReputation());
        
       
	}

}
