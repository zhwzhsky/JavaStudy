package dome;

public class VideoGame extends Item {
	
	private int numofPlayer;

	public VideoGame(String title, int playingTime, boolean gotIt, 
			String comment, int numofPlayer) {
		super(title, playingTime, gotIt, comment);
		this.numofPlayer = numofPlayer;
	}

	@Override
	public void print() {
		System.out.println("VideoGame:");
		super.print();
		
	}
}
