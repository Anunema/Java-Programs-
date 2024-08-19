package Java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int rev =0;
		int org_num = num;
		
		while(num !=0) {
			rev = rev*10+ num%10;
			num = num/10;
		}
		if(org_num == rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
