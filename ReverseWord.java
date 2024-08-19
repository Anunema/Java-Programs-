//Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
package Java;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "hello iam anu";
		String ar[] = text.split(" ");
		for(int i = ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}

}
}