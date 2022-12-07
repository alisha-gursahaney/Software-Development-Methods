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
	public boolean equals(Object backgroundimage1) {
		if (backgroundimage1 == null) {
			return false;
		}
		if (this == backgroundimage1) {
			return true;
		}
		if (backgroundimage1 instanceof BackgroundImage) {
			BackgroundImage otherBackgroundImage = (BackgroundImage) backgroundimage1;
			if (this.getImageFileName().equals(otherBackgroundImage.getImageFileName()) && this.getTitle().equals(otherBackgroundImage.getTitle()) && this.getDescription().equals(otherBackgroundImage.getDescription())) {
				return true;
			}
			
		}
		
		return false;
	}

}
