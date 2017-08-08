// 用于求解输入数字的平均数，用户输入-1位终止命令

import java.util.*;

public class Average_3_2{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	int input;
	int sum = 0,count = 0;
	double average=0.0;
	input = in.nextInt();
	if (input == -1)
		System.out.println("输入数字的平均值为："+average);
	else{
		do{
			sum = sum+input;
			count = count +1;
			input = in.nextInt();
			}while(input != -1);
		average = sum*1.0/count; 
		System.out.println("输入数字的平均值为："+average);
		
		}



	
	}
}