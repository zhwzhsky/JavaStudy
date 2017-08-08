package proWeek3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	private ArrayList<String> city = new ArrayList<String>();
	private int[][] cityDistance;
	

	public int getDistance(String city1, String city2) {
		return cityDistance[city.indexOf(city1)][city.indexOf(city2)];
	}
	
	public void setCity() {
		Scanner in = new Scanner(System.in);
		String city = new String();
		do {
			city = in.next();
			this.city.add(city);
		}while(!city.equals("###"));
		in.close();
	}
	
	public void setDistance() {
		
		cityDistance = new int[city.size()][city.size()];
		
		Scanner in = new Scanner(System.in);
		for(int i =0;i<city.size();i++)
			for(int j =0;j<city.size();j++) {
				cityDistance[i][j] = in.nextInt();
			} 
		in.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main citydistance = new Main();
		
		citydistance.setCity();
		citydistance.setDistance();

		Scanner in =new Scanner(System.in);
		String city1 = in.next();
		String city2 = in.next();

		System.out.printf("%d",citydistance.getDistance(city1, city2));

	}

}
