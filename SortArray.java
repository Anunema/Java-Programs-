//sort the given array 
package Java;

public class SortArray {

	public static void main(String[] args) {
		int ar[] = {4,5,3,2,6,1,7};
		for(int i =0;i<ar.length;i++) {
			for(int j =i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					
				}
				
			}
			
			System.out.print(ar[i]+" ");

		}
		
	}

}
