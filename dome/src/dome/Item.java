package dome;

public class Item {
	
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	
	public Item(String title, int playingTime, boolean gotIt, String comment) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment = comment;
	}

	public void setTitle(String s) {
		this.title = s;
	}

	public void print() {
		System.out.println(title);
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", playingTime=" + playingTime + ", gotIt=" + gotIt + ", comment=" + comment
				+ "]";
	}

	
	
}
