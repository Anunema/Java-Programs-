//String palindrome. A palindrome is a word, phrase, number, or sequence of words that reads the same backward as forward.
package Java;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "madam";
		char ar[] = text.toCharArray();
		boolean palindrome = false;
		for(int i=0;i<ar.length/2;i++) {
			
			if(ar[i] == ar[ar.length-i-1]) {
				palindrome= true;
			}
			
			
		
	}
		if(palindrome) {
			System.out.println("palindrome");
		
		}else {
			System.out.println("not");
		}

}
}
