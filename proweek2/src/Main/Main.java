package Main;

public class Main{
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

class Display {

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
}

class Clock {
	
	private Display hour = new Display(24) ;
	private Display minute = new Display(60);
	private Display second = new Display(60);
	private String clock;
	
	Clock(int hour, int minute, int second){
		this.hour.set(hour);
		this.minute.set(minute);
		this.second.set(second);
	}
	
	void tick() {
		this.second.add();
		if(second.get()==0) {
			minute.add();
			if (minute.get()==0) {
				hour.add();
			}
		}
	}
	
	public String toString () {
		clock = String.format("%02d:%02d:%02d", hour.get(),minute.get(),second.get());
		return clock;
	}
}