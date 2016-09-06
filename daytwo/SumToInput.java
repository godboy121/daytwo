package daytwo;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0,i;
		Scanner abc=new Scanner(System.in);
		System.out.print("ют╥б>");
		a=abc.nextInt();
		for(i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		
		
		

	}

}
