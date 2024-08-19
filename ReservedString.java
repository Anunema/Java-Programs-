package Java;

import java.util.Scanner;

public class ReservedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		System.out.println("text\n"+text);
		String reverse = "";
		for(int i = text.length()-1;i>=0;i--) {
			reverse = reverse+text.charAt(i);
		}
		
		System.out.println("reverse\n"+reverse);
}
	
}

