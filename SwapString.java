package Java;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "world";
		
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);

	}

}
