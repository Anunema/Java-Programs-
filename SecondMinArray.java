package Java;

public class SecondMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[] = {1,20,3,4,5,6,7};
		
		int min = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		
		
		for(int i =0;i<ar.length;i++) {
			if(ar[i]<min) {
			
			min = ar[i];
		}
			if(ar[i]>min && ar[i]<secondmin) {
				secondmin = ar[i];
			}
		

	}
		System.out.println(secondmin);

}
}
