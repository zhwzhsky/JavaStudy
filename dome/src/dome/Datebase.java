package dome;

import java.util.ArrayList;

public class Datebase {

//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
//	public void add(CD cd) {
//		listCD.add(cd);
//	}
//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}

	public void add(Item item) {
		listItem.add(item);
	}
	
	public void list() {
//		for(CD cd:listCD) {
//			cd.print();//print()是ArrayList的函数
//		}
//		for(DVD dvd:listDVD) {
//			dvd.print();
//		}
		for(Item item:listItem) {
			item.print();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datebase db1 = new Datebase();
		db1.add(new CD("qilixiang","jay",4,60,"good"));
		db1.add(new CD("sky","zhwzhsky",18,2017,"perfect"));
		db1.add(new DVD("GO","zhwzhsky",120,2017,"9.8分"));
		db1.add(new Item("haha",999,false,"well"));
		db1.list();
		
		Item item1 = new Item("item1",1,false,"");
		CD cd1 = new CD("aaa","",1,2,"");
		item1 = cd1;
//		CD cd2 = (CD)item1;  
		
	}

}
