public class Rating {
	
	private int score;
	private User user;
	
	public Rating() {
		this.score = 0;
		this.user = new User();
	}
	
	public Rating(User user, int score) {
		
		this.user = user;
		this.score = score;
		
	}

	public int getScore() {
		return this.score;
	}

	public boolean setScore(int score) {
		if (score == 0 || score == 1 || score == -1) {
			this.score = score;
			return true;
		}
	
		return false;
	}

	public User getUser() {
	
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		String username = getUser().getUserName();
		if (this.getScore() == 1) {
			return username + " rated as an upvote";
		}
		
		if (this.getScore() == -1) {
			return username + " rated as a downvote";
		}
		else {
			return username + " rated as a pass";
		}
	}
	
	@Override
	public boolean equals(Object rating1) {
		if (rating1 == null) {
			return false;
		}
		if(this == rating1) {
			return true;
		}
		if(rating1 instanceof Rating) {
			Rating otherRating = (Rating) rating1;
			if(this.getUser().equals(otherRating.getUser()) && this.getScore() == otherRating.getScore()) {
				return true;
			}
		}
		return false;
	}

}
