public class Rating {
	
	public int rating;
	
	public User user;
	
	public int getScore() {
		return rating;
	}
	public void setScore(int rating) {
		this.rating = rating;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "";
	}
	@Override
	public boolean equals(Object meme1) {
		return true;
	}
	public Rating() {
		this.user = new User ();
		this.rating = 0;
	}
}
