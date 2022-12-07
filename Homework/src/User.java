import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Meme> memesCreated = new ArrayList<Meme>();
    private ArrayList<Meme> memesViewed = new ArrayList<Meme>();

public User() {
    
}

public String getUserName() {
    return userName;
}

public void setUserName(String userName) {
    this.userName = userName;
}

public ArrayList<Meme> getMemesCreated(){
    return memesCreated;
}

public void setMemesCreated(ArrayList<Meme> memesCreated) {
    this.memesCreated = memesCreated;
}

public ArrayList<Meme> getMemesViewed() {
    return memesViewed;
}

public void setMemesViewed(ArrayList<Meme> memesViewed) {
    this.memesViewed = memesViewed;
}

public void rateMeme(Meme meme, int rating) {
         
}

public Meme createMeme(BackgroundImage bgImage, String caption){
    Meme meme = new Meme();
    return meme;
}

public boolean deleteMeme(Meme meme) {
    return true;
}

public void shareMeme(Meme meme, Feed feed) {
    
}

public void rateNextMemeFromFeed(Feed feed, int ratingScore) {
    
}

public double calculateReputation() {
    return 0.0;
}

public String toString() {
    return " ";
    
}

public boolean equals(Object meme) {
    return true;
    
}


}
