import java.util.*;

/* 猜数游戏：计算机生成一个随机数，用户不断的输入，提示大了或小了，直到用户猜中；*/

public class Game_3_2{ 
	public static void main(String[] args){
	
	int number = (int)(Math.random()*100+1); //[0,1)的随机数
	Scanner in = new Scanner(System.in);

	int count = 0;
	int input;

	do {	
		input = in.nextInt();
		count++;
		if (input > number)
			System.out.println("大了");
		else
			System.out.println("小了");
		}while(input != number);

	System.out.println("恭喜你,猜中了！你猜了"+count+"次！");

	}
}