public class BackgroundImage {
	
	private String imageFileName;
	private String title;
	private String description;
	
	public BackgroundImage() {
		this.imageFileName = new String();
		this.title = new String();
		this.description = new String();
	}
		
	public BackgroundImage(String imageFileName, String title, String description) {
		
		this.imageFileName = imageFileName;
		this.title = title;
		this.description = description;
		
	}

	public String getImageFileName() {
		return this.imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.title + " <" + this.description + ">";
	}
	
	@Override
	public boolean equals(Object bg1) {
		if (bg1 == null) {
			return false;
		}
		if (this == bg1) {
			return true;
		}
		if (bg1 instanceof BackgroundImage) {
			BackgroundImage otherBackgroundImage = (BackgroundImage) bg1;
			if (this.getImageFileName().equals(otherBackgroundImage.getImageFileName()) && this.getTitle().equals(otherBackgroundImage.getTitle()) && this.getDescription().equals(otherBackgroundImage.getDescription())) {
				return true;
			}
			
		}
		
		return false;
	}

}
