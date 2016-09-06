package daytwo;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=1,result;
		while(i<=9){
			
			j=1;
			while(j<=9)
			{
				result=i*j;
				System.out.println(i+"*"+j+"="+result);
				j++;
			}
			System.out.println("");
			i++;
		}

	}

}
