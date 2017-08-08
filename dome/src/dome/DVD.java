package dome;

public class DVD extends Item{
	
//	private String title;
	private String director;
//	private int numofTracks;
//	private int playingTime;
//	private boolean gotIt = false;
//	private String comment;
	
	

	public DVD(String title, String director, int numofTracks, int playingTime,
			String comment) {
		
		super(title, playingTime, false, comment );
		
//		this.title = title;
		this.director = director;
//		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print() {
		System.out.println("DVD:");
		super.print();
		System.out.println(director);
	}

}
