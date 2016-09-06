package daytwo;

public class leapyear {
	public static void main(String[] args)
	{
		//n1이 큰 값이 되도록 교체
		int n1=10;
		int n2=30;
		int temp;
		
		if(n1>=n2)
		{
			System.out.println("");
		}
		else
		{
			temp=n1;
			n1=n2;
			n2=temp;
			System.out.println("n1:"+n1+" n2:"+n2);
			
		}
		
	}

}
