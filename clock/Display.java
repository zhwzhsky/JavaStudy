package clock;

public class Display {

	private int limit = 0;
	private int display = 0;
	
	Display(int limit){
		this.limit  = limit;
	}
	
	void set(int init) {
		this.display = init;
	}
	
	public int get() {
		return this.display;
	}
	
	void add() {
		display++;
		if(display == limit)
			display = 0;
	}
	
	void print () {
		if(display<10)
			System.out.println("0"+display);
		else
			System.out.println(display+"");
	}
	
}
