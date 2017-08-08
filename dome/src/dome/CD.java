package dome;

public class CD extends Item{

//	private String title;
	private String artist;
//	private int numofTracks;
//	private int playingTime;
//	private boolean gotIt = false;
//	private String comment;
//	
	
	
	public CD(String title, String artist, int numofTracks, int playingTime, 
			String comment) {
		
		super(title, playingTime, false, comment);  //调用父类的构造器；
		
//		this.title = title;
		this.artist = artist;
//		this.numofTracks = numofTracks;
//		this.playingTime = playingTime;
//		this.comment = comment;
	}

	public void print() {
		System.out.println("CD:");
		super.print();
		System.out.println("  "+artist);
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", toString()=" + super.toString() + "]";
	}

	@Override 
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CD cc = (CD)obj;
		return artist.equals(cc.artist);
	}
	
	public static void main(String[] args) {
		
		CD cd2 = new CD("《ff》","sky",1,1,"hao");
		CD cd3 = new CD("《ff》","sky",1,1,"hao");
		System.out.println(cd2.equals(cd3));
	}
	
	

}
