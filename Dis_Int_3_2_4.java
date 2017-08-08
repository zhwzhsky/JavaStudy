// 分解整数

import java.util.*;

public class Dis_Int_3_2_4{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
		
	int input = in.nextInt();
	int number = 0;
	do{
		number = number*10+input%10;
		input = input/10;
	}while(input != 0);
	
	System.out.println(number);


	
	}
}