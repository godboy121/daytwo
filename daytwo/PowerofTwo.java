package daytwo;

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,a=1,result=1;
		Scanner abc=new Scanner(System.in);
		System.out.print("�¼���?");
		a=abc.nextInt();
		while(i<a)
		{
			result*=2;
			i++;
		}
		System.out.println("2��"+a+"��������"+result);
		
		

	}

}
