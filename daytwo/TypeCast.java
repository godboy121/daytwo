package daytwo;

public class TypeCast {

	public static void main(String args[]){
		byte b=127;
		int i = 414;
		double f = 123.456;
		
		b=(byte)i;
		System.out.println("int 414�� byte�� ��ȯ : " + b);
		i=(int)f;
		System.out.println("float 123.456�� int�� ��ȯ: " + i);
		b=(byte)f;
		System.out.println(" float 123.456�� byte�� ��ȯ: " + b);
	}


}
