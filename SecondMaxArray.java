// Find the second min/max number from an array. Write a method that accepts int array as an argument and returns second or n min/max number from the given array.

package Java;

public class SecondMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar [] = {1,10,37,3,5,6,5,40,38,26,67};
		
		int MAX = Integer.MIN_VALUE;
		int secondMAX  = Integer.MIN_VALUE;
		
		
		for(int i =0;i<ar.length;i++) {
			
			if(ar[i]>MAX) {
				secondMAX = MAX;
				MAX = ar[i];
			}
			if(ar[i]<MAX && ar[i]>secondMAX) {
				secondMAX = ar[i];
			}
		}
		System.out.println(secondMAX);
	}
	}
