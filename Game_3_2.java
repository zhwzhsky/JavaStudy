import java.util.*;

/* ������Ϸ�����������һ����������û����ϵ����룬��ʾ���˻�С�ˣ�ֱ���û����У�*/

public class Game_3_2{ 
	public static void main(String[] args){
	
	int number = (int)(Math.random()*100+1); //[0,1)�������
	Scanner in = new Scanner(System.in);

	int count = 0;
	int input;

	do {	
		input = in.nextInt();
		count++;
		if (input > number)
			System.out.println("����");
		else
			System.out.println("С��");
		}while(input != number);

	System.out.println("��ϲ��,�����ˣ������"+count+"�Σ�");

	}
}