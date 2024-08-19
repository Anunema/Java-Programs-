package Java;

public class SwapWithoutExtra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =8,b=7;
		
		
//		a = a+b;
//		b= a-b;
//		a=a-b;
//		System.out.println(a+ " "+ b);
//		
		
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		
		System.out.println(a+ " "+ b);

	}

}
